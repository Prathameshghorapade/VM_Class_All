class App{

public static void main(String args[]){

Watch watch=new Watch();

watch.watchDetails();

Watch watch1=new Watch(20,20,20);

watch1.watchDetails();

// watch1.hr=28;    //we cant do this because our fields are private aceesss, We only use setters

watch1.setHr(28);

watch1.watchDetails();



}


}