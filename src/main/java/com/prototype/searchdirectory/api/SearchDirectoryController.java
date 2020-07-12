package com.prototype.searchdirectory.api;

import com.prototype.searchdirectory.client.UserDirectoryServiceClient;
import com.prototype.searchdirectory.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
class SearchDirectoryController {
  @Autowired private UserDirectoryServiceClient userDirectoryServiceClient;

  @GetMapping("/users")
  public List<UserDTO> printStatus(@RequestParam(required = false, name = "search") String search) {
    // TODO Supposed to read from Postgres Read Replica, for simplicity calling UserDirectory ms
    return userDirectoryServiceClient.getActiveUsers(search);
  }
}
