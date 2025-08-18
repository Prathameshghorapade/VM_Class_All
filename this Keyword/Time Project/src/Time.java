class Time{



int second=0;

int minute=0;

int hour=0;


Time(){ }


Time(int second,int minute,int hour){

this.second=second;

this.minute=minute;

this.hour=hour;

}


int getSecond(){return second;}

int getMinute(){return minute;}

int getHour(){return hour;}

void setSecond(int second){this.second=second;}

void setMinute(int minute){this.minute=minute;}

void setHour(int hour){this.hour=hour;}



int nextSeccond(){

second =second+1;

return second;
}


void printTime(){

System.out.println("-------------------");

System.out.println("Second :"+second);

System.out.println("Minute :"+minute);

System.out.println("Hour :"+hour);

System.out.println("Next Second  :"+nextSeccond());

System.out.println("-------------------");

}


}