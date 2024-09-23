class ques2{
    public static void main(String[] args) {
        String str="  Java class java  ";
        String str2="hello";

        //Length method
        System.out.println(str.length());

        //Substring method
        System.out.println(str.substring(2,3));

        //Concat Method
        System.out.println(str.concat(str2));
        System.out.println(str+str2);
        System.out.println(str+2);
        System.out.println(str.concat("2"));

        //Replace method
        System.out.println(str.replace("a", "u"));
        str2=str.replace("Java", "python");
        System.out.println(str2);

        //Trim method
        System.out.println(str.trim());
        System.out.println(str);

        //Join method
        str= String.join(" java ","python","C","C++");
        System.out.println(str);
    }
}