package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class FourClass {

    public static Scanner sc = new Scanner(System.in);
    private static char[][] gameMap;
    private static final int DOTS_TO_WIN = 4;
    private static final char EMPTY_DOT = '.';
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static boolean gameOn = true;

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        createMap();
        printMap();

        int count = 0;
        while (gameOn) {
            humanTurn();
            count++;
            printMap();
            if (checkWin(X_DOT)){
                System.out.println("You win");
                break;
            } else if (count == DOTS_TO_WIN * DOTS_TO_WIN){
                System.out.println("Its draw");
                break;
            }
            System.out.println("--------------");
            pcTurn();
            count++;
            printMap();
            if (checkWin(O_DOT)){
                System.out.println("PC win");
                break;
            } else if (count == DOTS_TO_WIN * DOTS_TO_WIN){
                System.out.println("Its draw");
                break;
            }
        }
    }

    private static void pcTurn(){
        try {
            Thread.sleep(700);
        } catch (Exception e){}

        int x = 0;
        int y = 0;

        Random rd = new Random();
        boolean checkValid = false;
        checkValid = pcBeatYou();
        while(!checkValid) {
            x = rd.nextInt(DOTS_TO_WIN);
            y = rd.nextInt(DOTS_TO_WIN);
            checkValid = isValid(x, y);
            if (checkValid) {
                gameMap[x][y] = O_DOT;
            } else {
                continue;
            }
        }
    }

    private static boolean pcBeatYou(){
        int crossNum1 = 0;
        int crossNum2 = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            int curWinH = 0;
            int curWinW = 0;
            for (int j = 0; j < DOTS_TO_WIN; j++) {
                if (gameMap[j][i] == X_DOT){
                    curWinH++;
                }
                if (gameMap[i][j] == X_DOT){
                    curWinW++;
                }
            }
            if (curWinH == DOTS_TO_WIN - 1){
                for (int j = 0; j < DOTS_TO_WIN; j++) {
                    if (gameMap[j][i] == EMPTY_DOT){
                        gameMap[j][i] = O_DOT;
                        return true;
                    }
                }
            }
            if (curWinW == DOTS_TO_WIN - 1){
                for (int j = 0; j < DOTS_TO_WIN; j++) {
                    if (gameMap[i][j] == EMPTY_DOT){
                        gameMap[i][j] = O_DOT;
                        return true;
                    }
                }
            }
            if (gameMap[i][i] == X_DOT){
                crossNum1++;
            }
            if (gameMap[i][gameMap[i].length-i-1] == X_DOT){
                crossNum2++;
            }
        }
        if (crossNum1 == DOTS_TO_WIN - 1){
            for (int i = 0; i < DOTS_TO_WIN; i++) {
                if (gameMap[i][i] == EMPTY_DOT){
                    gameMap[i][i] = O_DOT;
                    return true;
                }
            }
        }
        if (crossNum2 == DOTS_TO_WIN - 1){
            for (int i = 0; i < DOTS_TO_WIN; i++) {
                if (gameMap[i][gameMap[i].length-i-1] == EMPTY_DOT){
                    gameMap[i][gameMap[i].length-i-1] = O_DOT;
                    return true;
                }
            }
        }

        return false;

    }

    private static void humanTurn() {
        boolean checkValid = false;
        while(!checkValid) {
            int x = -1;
            int y = -1;
            System.out.println("Please write X and Y coordination");
            if (sc.hasNextInt()) {
                x = sc.nextInt() - 1;
            }
            if (sc.hasNextInt()) {
                y = sc.nextInt() - 1;
            }
            checkValid = isValid(x, y);
            if (checkValid) {
                sc.nextLine();
                gameMap[x][y] = X_DOT;
            }
        }
    }

    private static boolean isValid(int x, int y) {
        if (x < 0 || y < 0 || x > DOTS_TO_WIN || y > DOTS_TO_WIN || gameMap[x][y] != EMPTY_DOT) {
            return false;
        } else {
            return true;
        }
    }

    private static void printMap() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[i].length; j++) {
                System.out.print("|");
                System.out.print(gameMap[i][j]);
            }
            System.out.println("|");
        }
    }

    private static void createMap() {
        if (DOTS_TO_WIN < 3) {
            System.out.println("Field is too small");
            System.exit(1);
        }
        gameMap = new char[DOTS_TO_WIN][DOTS_TO_WIN];
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[i].length; j++) {
                gameMap[i][j] = EMPTY_DOT;
            }
        }
    }

    private static boolean checkWin(char c) {
        int crossNum1 = 0;
        int crossNum2 = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            int curWinH = 0;
            int curWinW = 0;
            for (int j = 0; j < DOTS_TO_WIN; j++) {
                if (gameMap[j][i] == c){
                    curWinH++;
                }
                if (gameMap[i][j] == c){
                    curWinW++;
                }
            }
            if (curWinH == DOTS_TO_WIN || curWinW == DOTS_TO_WIN){
                return true;
            }
            if (gameMap[i][i] == c){
                crossNum1++;
            }
            if (gameMap[i][gameMap[i].length-i-1] == c){
                crossNum2++;
            }
        }
        if (crossNum1 == DOTS_TO_WIN || crossNum2 == DOTS_TO_WIN){
            return true;
        } else {
            return false;
        }
    }
}
