package com.redhat.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label("Shopping Cart")
public class ShoppingCart implements java.io.Serializable {

  static final long serialVersionUID = 1L;

  @org.kie.api.definition.type.Label("Cart Item Promotional Savings")
  @org.kie.api.definition.type.Position(1)
  private double cartItemPromoSavings;

  @org.kie.api.definition.type.Label("Cart Item Total")
  @org.kie.api.definition.type.Position(0)
  private double cartItemTotal;

  @org.kie.api.definition.type.Label("Shopping Cart Total")
  @org.kie.api.definition.type.Position(4)
  private double cartTotal;

  @org.kie.api.definition.type.Label("Shipping Promotional Savings")
  @org.kie.api.definition.type.Position(3)
  private double shippingPromoSavings;

  @org.kie.api.definition.type.Label("Shipping Total")
  @org.kie.api.definition.type.Position(2)
  private double shippingTotal;

  @org.kie.api.definition.type.Label("List of Shopping Cart Items")
  @org.kie.api.definition.type.Position(5)
  private java.util.List<com.redhat.coolstore.ShoppingCartItem> shoppingCartItemList;

  public ShoppingCart() {
  }

  public ShoppingCart(
      double cartItemPromoSavings,
      double cartItemTotal,
      double cartTotal,
      double shippingPromoSavings,
      double shippingTotal,
      java.util.List<com.redhat.coolstore.ShoppingCartItem> shoppingCartItemList) {
    this.cartItemPromoSavings = cartItemPromoSavings;
    this.cartItemTotal = cartItemTotal;
    this.cartTotal = cartTotal;
    this.shippingPromoSavings = shippingPromoSavings;
    this.shippingTotal = shippingTotal;
    this.shoppingCartItemList = shoppingCartItemList;
  }

  public java.util.List<com.redhat.coolstore.ShoppingCartItem> getShoppingCartItemList() {
    return this.shoppingCartItemList;
  }

  public void setShoppingCartItemList(java.util.List<com.redhat.coolstore.ShoppingCartItem> shoppingCartItemList) {
    this.shoppingCartItemList = shoppingCartItemList;
  }

  public double getCartItemPromoSavings() {
    return this.cartItemPromoSavings;
  }

  public void setCartItemPromoSavings(double cartItemPromoSavings) {
    this.cartItemPromoSavings = cartItemPromoSavings;
  }

  public double getCartItemTotal() {
    return this.cartItemTotal;
  }

  public void setCartItemTotal(double cartItemTotal) {
    this.cartItemTotal = cartItemTotal;
  }

  public double getCartTotal() {
    return this.cartTotal;
  }

  public void setCartTotal(double cartTotal) {
    this.cartTotal = cartTotal;
  }

  public double getShippingPromoSavings() {
    return this.shippingPromoSavings;
  }

  public void setShippingPromoSavings(double shippingPromoSavings) {
    this.shippingPromoSavings = shippingPromoSavings;
  }

  public double getShippingTotal() {
    return this.shippingTotal;
  }

  public void setShippingTotal(double shippingTotal) {
    this.shippingTotal = shippingTotal;
  }
}