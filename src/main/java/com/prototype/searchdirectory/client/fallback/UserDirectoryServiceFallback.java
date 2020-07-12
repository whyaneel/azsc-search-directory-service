package com.prototype.searchdirectory.client.fallback;

import com.prototype.searchdirectory.client.UserDirectoryServiceClient;
import com.prototype.searchdirectory.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserDirectoryServiceFallback implements UserDirectoryServiceClient {
  @Override
  public List<UserDTO> getActiveUsers(String search) {
    return Collections.emptyList();
  }
}
