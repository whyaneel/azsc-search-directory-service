package com.prototype.searchdirectory.client;

import com.prototype.searchdirectory.client.fallback.UserDirectoryServiceFallback;
import com.prototype.searchdirectory.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "azsc-user-directory-service", fallback = UserDirectoryServiceFallback.class)
public interface UserDirectoryServiceClient {
  @GetMapping("/api/users")
  List<UserDTO> getActiveUsers(@RequestParam(required = false, name = "search") String search);
}
