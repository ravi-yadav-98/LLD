import com.sun.source.tree.Tree;

public class Trie {
    public static void main(String[] args) {
        String[] words = {"mobile","mouse","moneypot","monitor","mousepad", "ravi","ryet", "rxty", "rysoss" };
        Node root = new Node();
        for(String  s : words)
        {
            insert(root, s);
        }
//        printWords(root,  new StringBuilder());

        printWordsWithPrefix(root, "mou");

    }

    public static void printWords(Node root, StringBuilder sb)
    {
        if(root == null)
        {
            return;
        }
        if(root.isEnd)
        {
            System.out.println(sb.toString());
            System.out.println();
        }
        for(int i =0; i<26; i++)
        {
            if(root.child[i] != null)
            {
                char  ch = (char) (i+97);
                sb.append(ch);
                printWords(root.child[i], sb);
                //back track
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    public static void printWordsWithPrefix(Node root, String prefix) {

        Node cur =  root;
        for(int i =0; i<prefix.length(); i++)
        {
            char ch = prefix.charAt(i);
            if(!cur.containsKey(ch))
            {
                return;
            }
            cur = cur.get(ch);

        }
        printWords(cur, new StringBuilder(prefix));
    }

    public static void  insert(Node root, String word)
    {
        Node temp = root;
        for(int i =0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            if(!temp.containsKey(ch))
            {
                temp.put(ch, new Node());
            }
            temp = temp.get(ch);
        }
        temp.isEnd = true;
    }
}

class Node{
    Node[] child = new Node[26];
    boolean isEnd = false;
    public  Node()
    {

    }
    boolean containsKey(char ch)
    {
        return child[ch-'a'] != null;
    }

    void put(char ch, Node node)
    {
        child[ch -'a'] = node;
    }
    Node get(char ch)
    {
        return child[ch-'a'];
    }
}

