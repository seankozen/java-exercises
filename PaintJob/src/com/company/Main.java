package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(getBucketCount(-3.4,2.1, 1.5,2) );
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(" ");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(" ");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));


    } //End of void main

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        //width = width of wall
        //height = height of wall
        //areaPerBucket = cover area of one bucket
        //extraBuckets = buckets at home

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }

        int bucketsToBuy = (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
        return bucketsToBuy;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        //width = width of wall
        //height = height of wall
        //areaPerBucket = cover area of one bucket

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)){
            return -1;
        }

        int bucketsToBuy = (int) Math.ceil(((width * height) / areaPerBucket));
        return bucketsToBuy;
    }

    public static int getBucketCount (double area, double areaPerBucket) {

        if ((area <= 0)|| (areaPerBucket <= 0)){
            return -1;
        }

        int bucketsToBuy = (int) Math.ceil(area / areaPerBucket);
        return bucketsToBuy;
    }



} //End of Main
