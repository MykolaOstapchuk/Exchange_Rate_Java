package com.example.testretrofir;

import com.google.gson.annotations.SerializedName;

public class RecyclerData {
    // string variables for our data
    // make sure that the variable name
    // must be similar to that of key value
    // which we are getting from our json file.
    @SerializedName("buy")
    private String buy_price;
    @SerializedName("sale")
    private String sale_price;

    @SerializedName("ccy")
    private String currency;
    @SerializedName("base_ccy")
    private String base_currency;


    public RecyclerData(String buy_price, String sale_price, String currency, String base_currency) {
        this.buy_price = buy_price;
        this.sale_price = sale_price;
        this.currency = currency;
        this.base_currency = base_currency;
    }

    public String getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(String buy_price) {
        this.buy_price = buy_price;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBase_currency() {
        return base_currency;
    }

    public void setBase_currency(String base_currency) {
        this.base_currency = base_currency;
    }
}
