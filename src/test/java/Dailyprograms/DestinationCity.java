package Dailyprograms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {

    /*
    https://leetcode.com/problems/destination-city/
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.



Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

    Input: List of list of string
    output String


    Pseudocode:

    Create the hashset to store the cities
    iterate over the path and add the start city of each path of the set
    Iterate over the path again and find the city that does not appear in the set
    Return the city that does not appear in the set

     */
    @Test
    public void test(){
        List<List<String>> paths1 =new ArrayList<>();
        paths1.add(Arrays.asList("London","New York"));
        paths1.add(Arrays.asList("New York", "Lima"));
        paths1.add(Arrays.asList("Lima", "Sao Paulo"));
        String s = destinationCity(paths1);
        Assert.assertEquals("Sao Paulo",s);
    }

    @Test
    public void test1() {
        List<List<String>> paths2 = new ArrayList<>();
        paths2.add(Arrays.asList("B", "C"));
        paths2.add(Arrays.asList("D", "B"));
        paths2.add(Arrays.asList("C", "A"));
        String s = destinationCity(paths2);
        Assert.assertEquals("A",s);
    }
    @Test
    public void test2() {
        List<List<String>> paths3 = new ArrayList<>();
        paths3.add(Arrays.asList("A", "Z"));
        String s = destinationCity(paths3);
        Assert.assertEquals("Z",s);
    }
    public String destinationCity(List<List<String>> paths){

// Create the hashset to store the cities
        HashSet<String> destination = new HashSet<>();
// iterate over the path and add the start city of each path of the set
        for (List<String> path: paths){
            destination.add(path.get(0));
        }
//        Iterate over the path again and find the city that does not appear in the set
        for (List<String> path: paths){
            if(!destination.contains(path.get(1))){
                return path.get(1);
            }

        }
        return null;
    }
}
