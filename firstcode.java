interface Student{
    int id = 5;
    String name="varun";
    void grade();
}
interface Bca extends  Student{
    default void grade(){
        System.out.println("bca");
    }
}

interface Mca extends Student{
    default void grade(){
        System.out.println("mca");
    }
}

class Grade implements Bca,Mca{
    public void grade(){
        System.out.println("hello");
    }
}
class firstcode{
	public static void main(String[] args){
		Grade obj=new Grade();
        obj.grade();
	}
}