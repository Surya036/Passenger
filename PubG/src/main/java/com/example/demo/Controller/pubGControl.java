package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.pubG;
import com.example.demo.Service.PubGService;



@RestController
public class pubGControl {
	@Autowired
	PubGService fservice;
	
	@ManagedOperation(summary = "Execute this method")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/getData")
	public List<pubG> getData()
	{
		return fservice.getData();
	}
	
	@GetMapping(value="/sortData/{field}")
	public List<pubG> sortData(@PathVariable("field") String field)
	{
		return fservice.sortData(field);
	}
	
	@PostMapping("/postData")
	public pubG postData(@RequestBody pubG f)
	{
		return fservice.postData(f);
	}
	
	@GetMapping("/pageData/{offset}/{noofrecords}")
	public Page<pubG> pagingFF(@PathVariable("offset") int offset,@PathVariable("noofrecords") int noOfRecords)
	{
		return fservice.pagingFF(offset,noOfRecords);
	}
	@GetMapping("/pageDataList/{offset}/{noofrecords}")
	public List<pubG> pagingByList(@PathVariable("offset") int offset,@PathVariable("noofrecords") int noOfRecords)
	{
		return fservice.pagingByList(offset,noOfRecords);
	}
	@GetMapping("/pageDataAsc/{offset}/{noofrecords}/{field}")
	public List<pubG> pagingByAsc(@PathVariable("offset") int offset,@PathVariable("noofrecords") int noOfRecords,@PathVariable("field") String field)
	{
		return fservice.pagingByAsc(offset,noOfRecords,field);
	}
	@GetMapping("/pageDataDesc/{offset}/{noofrecords}/{field}")
	public List<pubG> pagingByDesc(@PathVariable("offset") int offset,@PathVariable("noofrecords") int noOfRecords,@PathVariable("field") String field)
	{
		return fservice.pagingByDesc(offset,noOfRecords,field);
	}
	
	@Operation(summary = "To get Data's of server only")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/getdata/{field}")
	public List<pubG> getDataByField(@PathVariable("field") String field)
	{
		return fservice.getDataByField(field);
	}
	
	
	@Operation(summary = "To get Data's of server with Starting words")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/getdataByPrefix")
	public List<pubG> getDataByPrefix(@RequestParam String field)
	{
		return fservice.getDataByPrefix(field);
	}
	
	@Operation(summary = "To get Data's of server with ending words")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/getdataBySuffix")
	public List<pubG> getDataBySuffix(@RequestParam String field)
	{
		return fservice.getDataBySuffix(field);
	}
	
	@Operation(summary = "To get Data's by name and server using RequestParam")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/queryData")
	public List<pubG> getDataByQuery(@RequestParam String name,@RequestParam String server)
	{
		return fservice.getDataByPosPara(name,server);
	}
	
	@Operation(summary = "To get Data's by name and server using RequestParam")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/queryDataName")
	public List<pubG> getDataByPName(@RequestParam String name,@RequestParam String server)
	{
		return fservice.getDataByNamePara(name,server);
	}
	
	@Operation(summary = "Delete Data's using Query in FreeFire")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@DeleteMapping("/deleteDataQuery")
	public String deleteDataQuery(@RequestParam String name)
	{
		int result = fservice.deleteDataQuery(name);
		if(result>0)
		{
			return "Record is deleted";
		}
		else 
		{
			return "Problem occured while deleting or no records found";
		}
	}
	
	@Operation(summary = "To Updata name and elite in FreeFire with Id using RequestParam")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@PutMapping("/updatepubG")
	public int updateFreeFire(@RequestParam String name,@RequestParam String elite,@RequestParam String id)
	{
		return fservice.updateFreeFire(name,elite,id);
	}
	
	@Operation(summary = "To Get Data's in FreeFire with Elite using RequestParam")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful"),
			@ApiResponse(responseCode = "401", description = "Invalid credentials"),
			@ApiResponse(responseCode = "404", description = "Path not found") })
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/getDatapubG")
	public List<pubG> getDataFreeFire(@RequestParam String elite)
	{
		return fservice.getDatapubG(elite);
	}
}