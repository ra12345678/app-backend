package com.example.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Allow the UI origin (CloudFront UI domain) over HTTPS
@CrossOrigin(origins = {"https://ui.example.com"}, allowCredentials = "false")
@RestController
public class ApiController {

  private final CustomerRepository repo;

  @Value("${app.name:example-api}")
  private String appName;

  public ApiController(CustomerRepository repo) {
    this.repo = repo;
  }

  @GetMapping("/health")
  public ResponseEntity<?> health() {
    return ResponseEntity.ok().body(new java.util.HashMap<String,Object>() {{
      put("status", "ok");
      put("service", appName);
    }});
  }

  @GetMapping("/api/customers")
  public ResponseEntity<?> customers() {
    List<Customer> all = repo.findAll();
    return ResponseEntity.ok().body(new java.util.HashMap<String,Object>() {{
      put("data", all);
    }});
  }
}
