package edu.eci.tdse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class MathService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MathService.class);

    public MathService() {}

    public static ArrayList<Integer> pellSequence(int n) {
        LOGGER.info("Making pell sequence for value: {}", n);
        if (n < 0) {
            LOGGER.info("This is an invalid number for a pell sequence");
        }
        ArrayList<Integer> pellList = new ArrayList<>();
        if ( n >= 2) {
            for (int i = 0; i <= n; i++){
                if (i == 0 || i == 1){
                    pellList.add(i);
                } else {
                    int pellSeq = 2 * pellSequenceForN(i - 1) + pellSequenceForN(i - 2);
                    pellList.add(pellSeq);
                }
            }
            return pellList;
        }
        return pellList;
    }

    private static int pellSequenceForN(int n){
        if (n < 0) {
            LOGGER.info("This is an invalid number for a pell sequence");
        }
        if (n == 0 || n == 1){
            return n;
        }

        if ( n >= 2) {
            int pellSeq = 2 * pellSequenceForN(n - 1) + pellSequenceForN(n - 2);
            return pellSeq;
        }
        return n;
    }
}
