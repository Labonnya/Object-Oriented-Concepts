package com.company;

import java.util.PriorityQueue;

public class priority {
    PriorityQueue <Double> queue = new PriorityQueue<Double>();
    public priority(){
        queue.offer(3.2);
        queue.offer(8.9);
        queue.offer(5.6);
        }
        public void display(){
        while(queue.size()>0){
            double d = queue.peek();
            queue.poll();
            System.out.println(" "+d);
        }
        }
    }

