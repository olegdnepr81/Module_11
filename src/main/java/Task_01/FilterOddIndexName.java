package Task_01;

public class FilterOddIndexName {
    public String nameLine (String[] name){
        StringBuilder line = new StringBuilder();
        for (int i = 0; i< name.length; i++){
            if(i%2>0){
                line.append(i + "." );
                line.append(name[i] + " ");

            }
        }
        return  line.toString().trim();
    }
}
