package org.zerock.domain;

import lombok.Data;

@Data
public class OrderVO {
    //아무것도 들어가지 않으면 0이 들어간다.
    private int mno;
    private int qty;

    public OrderVO(String str){
        String[] arr = str.split("_");
        if (arr.length != 2){ return; }

        this.mno = Integer.parseInt(arr[0]);
        this.qty = Integer.parseInt(arr[1]);
    }

}
