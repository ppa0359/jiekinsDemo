package com.aaa.boottest.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * fileName:MainClass
 * description:
 * author:zz
 * createTime:2019-05-21 7:05
 */
public class MainClass {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("aaa"+Thread.currentThread().getName());

                }
            });

        }

    }
}
