package com.redhat.coolstore.rest;

import com.redhat.coolstore.model.kie.ShoppingCart;
import com.redhat.coolstore.service.ShoppingCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;

import java.io.Serializable;

@RestController
@Scope(scopeName = WebApplicationContext.SCOPE_SESSION)
@RequestMapping("/api/cart")
public class CartEndpoint implements Serializable {
  private static final Logger LOG = LoggerFactory.getLogger(CartEndpoint.class);

  /** */
  private static final long serialVersionUID = -7227732980791688773L;

  @Autowired
  private ShoppingCartService shoppingCartService;

  @GetMapping("/{cartId}")
  public ShoppingCart getCart(@PathVariable("cartId") String cartId) {

    return shoppingCartService.getShoppingCart(cartId);
  }

  @PostMapping("/{cartId}/{itemId}/{quantity}")
  public ShoppingCart add(
      @PathVariable("cartId") String cartId,
      @PathVariable("itemId") String itemId,
      @PathVariable("quantity") int quantity)
      throws Exception {
    return shoppingCartService.addItem(cartId, itemId, quantity);
  }

  @PostMapping("/{cartId}/{tmpId}")
  public ShoppingCart set(@PathVariable("cartId") String cartId, @PathVariable("tmpId") String tmpId)
      throws Exception {

    return shoppingCartService.set(cartId, tmpId);
  }

  @DeleteMapping("/{cartId}/{itemId}/{quantity}")
  public ShoppingCart delete(
      @PathVariable("cartId") String cartId,
      @PathVariable("itemId") String itemId,
      @PathVariable("quantity") int quantity)
      throws Exception {

    return shoppingCartService.deleteItem(cartId, itemId, quantity);
  }

  @PostMapping("/checkout/{cartId}")
  public ShoppingCart checkout(@PathVariable("cartId") String cartId) {
    // TODO: register purchase of shoppingCart items by specific user in session
    return shoppingCartService.checkout(cartId);
  }
}
