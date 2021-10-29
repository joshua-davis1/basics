// Given a list of integers, return a list where each integer is multiplied by 2.

package com.ss.fs.basics.five.assignments.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartThree {

    public static void main(String[] args) {
        PartThree utility = new PartThree();

        List<Integer> numbArr = new ArrayList<>();
        numbArr.add(45); numbArr.add(71); numbArr.add(94); numbArr.add(12133121); numbArr.add(null);

        System.out.println(utility.doubling(numbArr));

    }

    List<Integer> doubling(List<Integer> numbArr) {
        return numbArr.stream().map(numb -> {
            if(numb != null) {
                return numb * 2;
            }
            return 0;
        }).collect(Collectors.toList());
    }
}
