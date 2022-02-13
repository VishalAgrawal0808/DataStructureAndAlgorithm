package com.DataStructure.String;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("India");
//        arrayList.add("Gemany");
//        arrayList.add("Guyana");
//        arrayList.add("Brazil");
//        arrayList.set(1, "Sudan");
//        arrayList.set(3, "Egypt");
//        arrayList.remove(2);
//        List<String> list = arrayList.subList(0, arrayList.size()/2);
//        Iterator<String> itr = list.iterator();
//        while(itr.hasNext()){
//            int index = 1;
//            itr.next();
//            if(list.subList(0, arrayList.size()/3).contains("_r%") && (index>=0 && index<list.size())){
//                list.remove(index);
//                index++;
//            }
//        }
//        System.out.println(list);



//        String str = "geeks for geeks";
//        char[] ch = str.toCharArray();
//        System.out.println(Arrays.toString(ch));
//        for(int i=0;i<ch.length;i++){
//            int k=i;
//            while(i<ch.length && ch[i]!=' '){
//                i++;
//            }
//            char temp = ch[i-1];
//            ch[i-1] = ch[k];
//            ch[k] = temp;
//        }
//
//        System.out.println(Arrays.toString(ch));
//        System.out.println(new String(ch));

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char[] ch = s.toCharArray();
//        int i=0;
//        while(i<ch.length){
//            char temp = ch[ch.length-1];
//            ch[ch.length-1] = ch[i];
//            ch[i] = temp;
//            i++;
//        }
//        System.out.println(new String(ch));
        String str = "Vishal Agrawal is a very very good boy";
        char[] a = str.toCharArray();
        System.out.println(Arrays.toString(a));
    }
}
