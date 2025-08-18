public class Watch{

private int hr,min,sec;


public Watch(){

hr=sec=min=10;

}


public Watch(int hr,int min,int sec){

this.hr=hr;
this.min=min;
this.sec=sec;

}


int getHr(){return hr;}

int getMin(){return min;}

int getSec(){return sec;}


void setHr(int hr){ this.hr=hr;}

void setMin(int min){ this.min=min;}

void setSec(int sec){ this.sec=sec;}

void watchDetails(){

System.out.println("Hour :"+hr);

System.out.println("Minute :"+min);

System.out.println("Second :"+sec);


}

}