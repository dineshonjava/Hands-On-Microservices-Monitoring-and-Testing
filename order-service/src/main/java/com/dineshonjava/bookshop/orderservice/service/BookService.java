/**
 * 
 */
package com.dineshonjava.bookshop.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Dinesh.Rajput
 *
 */
@FeignClient("book-service")
public interface BookService {

}
