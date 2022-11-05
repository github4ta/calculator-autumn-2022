package by.itacademy.stones;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {



            //List<Stone> stoneHeap = ((Stones) unmarshaller.unmarshal(new File("D:\\pdp\\task1\\src\\main\\resources\\stones.json"))).stones;

            Stone stone1 = new Stone("Diamond", 5, 0.5f, 1500);
            Stone stone2 = new Stone("Turquoise", 5, 0.7f, 1000);
            Stone stone3 = new Stone("Amber", 5, 0.6f, 2000);
            Stone stone4 = new Stone("Turquoise", 5, 0.5f, 1070);
            Stone stone5 = new Stone("Sapphire", 5, 0.5f, 1070);

            List<Stone> stoneHeap = new ArrayList<Stone>();
            stoneHeap.add(stone1);
            stoneHeap.add(stone2);
            stoneHeap.add(stone3);
            stoneHeap.add(stone4);
            stoneHeap.add(stone5);

            //System.out.println(stoneHeap);

            Stone current = StoneFactory.getStone(stoneHeap.get(0));
            Stone current2 = StoneFactory.getStone(stoneHeap.get(1));

            //System.out.println(current);

            Necklace necklace = new Necklace.Builder(stoneHeap).stoneName("Diamond").stoneName("Sapphire").stoneName("Turquoise")
                    .stoneName("Amber").build();
            System.out.println(necklace);
            necklace.sort();
            System.out.println(necklace);
            System.out.println(necklace.getStonesByTransparency(0.5f, 0.6f));

            /*
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("stones.json"));
            */



/*
            Stone current = StoneFactory.getStone(stoneHeap.get(0));
            Stone current2 = StoneFactory.getStone(stoneHeap.get(1));
            LOG.info(current);
            LOG.info(current2);
            Necklace necklace = new Necklace.Builder(stoneHeap).stoneName("Diamond").stoneName("Sapphire").stoneName("Turquoise")
                    .stoneName("Amber").build();
            LOG.info(necklace);
            necklace.sort();
            LOG.info(necklace);
            LOG.info(necklace.getStonesByTransparency(0.5f, 0.6f));
            */

    }
}
