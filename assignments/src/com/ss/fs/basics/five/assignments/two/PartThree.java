// Given a list of integers, return a list where each integer is multiplied by 2.

package com.ss.fs.basics.five.assignments.two;

import java.util.List;
import java.util.stream.Collectors;

public class PartThree {

    List<Integer> doubling(List<Integer> numbArr) {
        return numbArr.stream().map(numb -> {
            if(numb != null) return numb * 2;
            return 0;
        }).collect(Collectors.toList());
    }
}
