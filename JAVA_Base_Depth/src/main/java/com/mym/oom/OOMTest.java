package com.mym.oom;

import sun.misc.VM;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class OOMTest {

    public static void main(String[] args) throws InterruptedException {

//        stackOverflowError();   // Exception in thread "main" java.lang.StackOverflowError

//        javaHeapSpace();            // java.lang.OutOfMemoryError: Java heap space

//        directBufferMemory();       //java.lang.OutOfMemoryError: Direct buffer memory
    }

    /** 测试深度递归调用的栈溢出 */
    public static void stackOverflowError(){
        stackOverflowError();
    }

    public static void javaHeapSpace(){
        byte[] a = new byte[100000000];
    }

    public static void directBufferMemory() throws InterruptedException {
        System.out.println("当前direct memory:" + VM.maxDirectMemory());
        TimeUnit.SECONDS.sleep(3);
        ByteBuffer b = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }

}
