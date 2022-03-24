package com.devjenni.programmers.level3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class 회원에게추천하기 {
    public static String solution(String[] products, String[] purchased) {
        String answer = "";
        List<product> prdct = new ArrayList<>();
        Map<String, Integer> pchs = new HashMap<>();
        List<String> notBuy = new ArrayList<>();

        for(int i=0; i<products.length; i++) {
            Stack<String> pch = new Stack<>();
            String[] p_info = products[i].split(" ");

            for(int j=1; j<p_info.length; j++) {
                pch.push(p_info[j]);
                pchs.put(p_info[j], 0);
            }

            prdct.add(new product(p_info[0], pch));
            notBuy.add(p_info[0]);
        }

        for(int i=0; i<purchased.length; i++) {
            String purchase = purchased[i];
            Optional<product> p = prdct.stream().filter(s -> s.getProduct_name().equals(purchase)).findFirst();
            notBuy.remove(purchase);

            for(String s: p.get().getProduct_purchase()) {
                int cnt = pchs.get(s) + 1;
                pchs.remove(s);
                pchs.put(s, cnt);
            }
        }

        pchs = pchs.entrySet().stream()
                .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for(String str: pchs.keySet()) {
            Optional<product> p = prdct.stream().filter(s -> s.getProduct_purchase().contains(str)
                                                                    && notBuy.contains(s.getProduct_name())).findFirst();

            if(p!=null) return p.get().getProduct_name();
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] prdct1 = {"sofa red long", "blanket blue long", "towel red", "mattress long", "curtain blue long cheap"};
        String[] prdct2 = {"towel red long thin", "blanket red thick short", "curtain red long wide", "mattress thick", "hat red thin", "pillow red long", "muffler blue thick long"};
        String[] pchs1 = {"towel", "mattress", "curtain"};
        String[] pchs2 = {"blanket", "curtain", "hat", "muffler"};

        System.out.println(solution(prdct1, pchs1));
        System.out.println(solution(prdct2, pchs2));
    }
}

class product {
    private String product_name;
    private Stack<String> product_purchase;

    public product(String product_name, Stack<String> product_purchase) {
        this.product_name = product_name;
        this.product_purchase = product_purchase;
    }

    public String getProduct_name() {
        return product_name;
    }

    public Stack<String> getProduct_purchase() {
        return product_purchase;
    }
}