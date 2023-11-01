package com.chat.message.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class test {

    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        redShirtHeights.add(3);
        redShirtHeights.add(5);
        redShirtHeights.add(1);
        redShirtHeights.add(4);
        redShirtHeights.add(2);

        blueShirtHeights.add(3);
        blueShirtHeights.add(2);
        blueShirtHeights.add(4);
        blueShirtHeights.add(5);
        blueShirtHeights.add(6);

        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        List<Boolean> blueShirts = new ArrayList<>();
        List<Boolean> redShirts = new ArrayList<>();

        for(int i=0; i<redShirtHeights.size(); i++){
            redShirts.add(redShirtHeights.get(i)>blueShirtHeights.get(i));
            blueShirts.add(redShirtHeights.get(i)<blueShirtHeights.get(i));
        }


        return check(redShirts) || check(blueShirts);
    }

    public Boolean check(List<Boolean> array){
        array.forEach(aBoolean -> {
            if(!aBoolean)
                return;
        });
        return true;
    }
}

