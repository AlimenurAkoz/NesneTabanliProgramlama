

public class Race {
    private String[] studentName;
    private final int[] minute;

    public Race(String[] studentNameArray, int[] minuteArray) {
        studentName = studentNameArray;
        minute = minuteArray;
    }

    public String[] getStudentName() {
        return studentName;
    }

    public void setStudentName(String[] studentNameArray) {
        studentName = studentNameArray;
    }

    public void processStudent() {

        System.out.println("Birinci: " + getFirstName() + " " + getFirst() + "'");
        System.out.println("İkinci: " + getSecondName() + " " + getSecond() + "'");
        System.out.println("Üçüncü: " + getThirdName() + " " + getThird() + "'");
        range();

    }

    public int getFirst() {
        int first = minute[0];
        for (int elementMinute : minute) {
            if (elementMinute < first) {
               first = elementMinute;
            }
        }
        return first;
    }

    public int getFirstIndex() {
        int i;
        int arrayLength = minute.length;
        for (i = 0; i <= arrayLength - 1; i++) {
            if (minute[i] == getFirst()) {
                break;
            }
        }
        return i;
    }

    public String getFirstName() {
        String firstName = studentName[getFirstIndex()];
        return firstName;
    }


    public int getSecond() {
        int second = minute[0];
        for (int elementMinute : minute) {
            if (elementMinute < second && getFirst() < elementMinute) {
                second = elementMinute;
            }
        }
        return second;
    }

    public int getSecondIndex(){
        int i;
        int arrayLength = minute.length;
        for (i = 0; i <= arrayLength - 1; i++) {
            if (minute[i] == getSecond()) {
                break;
            }
        }
        return i;
    }

    public String getSecondName(){
        String secondName = studentName[getSecondIndex()];
        return secondName;
    }

    public int getThird() {
        int third = minute[0];
        for (int elementMinute : minute) {
            if (elementMinute < third && getSecond() < elementMinute) {
                third = elementMinute;
            }
        }
        return third;
    }

    public int getThirdIndex(){
        int i;
        int arrayLength = minute.length;
        for (i = 0; i <= arrayLength - 1; i++) {
            if (minute[i] == getThird()) {
                break;
            }
        }
        return i;
    }

    public String getThirdName(){
        String thirdName = studentName[getThirdIndex()];
        return thirdName;
    }

    public void range() {
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        for (int elementMinute : minute) {
            if (200 <= elementMinute && elementMinute <= 299) {
                totalA++;

            } else if (300 <= elementMinute && elementMinute <= 399) {
                totalB++;


            } else if (400 <= elementMinute) {
                totalC++;
            }

        }
        System.out.println("A -> " + totalA);
        System.out.println("B -> " + totalB);
        System.out.println("C -> " + totalC);

    }


}
