package org.lessons.java.shop;

import java.util.Random;

public class Product {

            //Attributi

            private int productCode;
            private String productName;
            private String productDescription;
            private double productPrice;
            private double iva;

            //Costruttori

            public Product(String productName, String productDescription, double productPrice, double iva)throws IllegalArgumentException{
                if (productName == null || productName.isEmpty()){
                    throw  new IllegalArgumentException("Product name must be not empty");
                }
                if (productPrice<=0){
                    throw new IllegalArgumentException("Price must be >=0");
                }
                if (iva<=0){
                    throw new IllegalArgumentException("Iva must be >=0");
                }
                this.productName = productName;
                this.productDescription = productDescription;
                this.productPrice = productPrice;
                this.iva = iva;
            }
            //getter and setter

            public int getProductCode(){
                int productCode = randomCode.nextInt(10000,99999);
                return productCode;
            }

            public String getProductName(){
                return productName;
            }

           public String getProductDescription() {
              return productDescription;
           }

           public double getProductPrice() {
               return productPrice;
           }

           public double getIva() {
                return iva;
          }

          public void setProductName(String  productName){
                this.productName = productName;
          }

          public void setProductDescription(String productDescription){
                this.productDescription = productDescription;
          }

          public void  setProductPrice(double productPrice){
                this.productPrice = productPrice;
          }

          public void setIva(double iva){
                this.iva = iva;
          }

          //Metodi

         Random randomCode = new Random();

            public int randomProductCode = randomCode.nextInt(10000,999999);

            public double priceIva(){
              return  productPrice += productPrice/100 * iva;

            }

}
