/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        int indexHash = post.indexOf("#");

        String newString = post.substring((indexHash+1));

       int hash = post.indexOf("#") -1;
       int hash2 = newString.indexOf("#")+hash+1;

       String firstHashtag = post.substring(hash, hash+8);
       String secondHashtag = post.substring(hash2, hash2+6);
        System.out.println("Hashtag:"+firstHashtag+", Hashtag:"+ secondHashtag);


    }

}
