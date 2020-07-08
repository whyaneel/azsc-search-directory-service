package com.prototype.searchdirectory.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SearchDirectoryController {
  @Value("${implementation.status:Unknown}")
  private String implementationStatus;

  @GetMapping("/status")
  public String printStatus() {
    return implementationStatus;
  }
}
