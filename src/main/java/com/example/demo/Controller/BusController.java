//package com.example.demo.Controller;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.Entity.BusEntity;
//import com.example.demo.Service.BusService;
//
//@RestController
//public class BusController {
//	
//	@Autowired
//	BusService Eservice;
//	
//	@GetMapping("/showDetails")
//	public List <BusEntity> show() {
//		return Eservice.showDetails();
//	}
//	@GetMapping("/showDetails/{id}")
//	public Optional<BusEntity> getById(@PathVariable int id) {
//		return Eservice.getById(id);
//	}
//	
//	@PutMapping("/updateDetails")
//	public String update(@RequestBody BusEntity ee) {
//		return Eservice.updateDetails(ee);
//	}
//	
//	@DeleteMapping("/deleteDetails/{eid}")
//	public String delete(@PathVariable("eid") int id) {
//		return Eservice.deleteDetails(id);
//	}
//	
//	@PostMapping("/addDetails")
//	public String add(@RequestBody BusEntity ee) {
//		return Eservice.addDetails(ee);
//	}
//	
//	@GetMapping("/sortedDetails/{field}")
//	public List <BusEntity> sort(@PathVariable String field){
//		return Eservice.sortByField(field);
//	}
//	@GetMapping("/pagination")
//	public List <BusEntity> pagination(@RequestParam int offset,@RequestParam int pagesize){
//		return Eservice.getWithPagination(offset,pagesize);
//	}
//
//}