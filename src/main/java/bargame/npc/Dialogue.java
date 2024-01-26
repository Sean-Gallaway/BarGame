package bargame.npc;

import bargame.App;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public enum Dialogue {
    Dragon(new Conversation[]{
        Conversation.TEST,
        Conversation.TESTTWO
    });

    Conversation[] convo;
    Dialogue (Conversation[] convo) {
        this.convo = convo;
    }

    public int getAmountOfDialogue () {
        return convo.length;
    }
    public String[] getDialogue (int convoNum) {
        if (convoNum >= convo.length) {
            System.out.println("Conversation number out of bounds");
            return null;
        }
        else {
            return convo[convoNum].getContent();
        }
    }
}

enum Conversation {
    TEST("text"),
    TESTTWO("texttwo");

    String[] content;
    Conversation (String path) {
        try {
            Queue<String> temp = new LinkedList<>();
            InputStream file = App.class.getResourceAsStream("/dialogue/" + path + ".txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                temp.add(sc.nextLine());
            }

            content = new String[temp.size()];
            for (int a = 0; a < content.length; a++) {
                content[a] = temp.poll();
            }
            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] getContent () {
        return content;
    }
}
