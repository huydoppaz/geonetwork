package org.fao.geonet.kernel.search;

import jeeves.utils.Log;
import org.fao.geonet.constants.Geonet;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Parses stopword files. Stopword files have lines with zero or more stopwords. Any content from the character | until
 * the end of the line is ignored.
 *
 * @author heikki doeleman
 */
public class StopwordFileParser {

    /**
     * Parses a stopwords file.
     *
     * @param filepath path to stopwords file
     * @return set of stopwords, or null if none found
     */
    public static Set<String> parse(String filepath) {
        filepath = filepath + "_stop.txt";
        Log.debug(Geonet.STOPWORD_PARSER, "StopwordParser parsing file: " + filepath);
        Set<String> stopwords = null;
        try {
            File file = new File(filepath);
            if(file.exists()) {
                Scanner scanner = new Scanner(new FileReader(file));
                try {
                    while (scanner.hasNextLine()){
                      Set<String> stopwordsFromLine = parseLine(scanner.nextLine());
                      if(stopwordsFromLine != null) {
                          if(stopwords == null) {
                              stopwords = new HashSet<String>();
                          }
                          stopwords.addAll(stopwordsFromLine);
                      }
                    }
                }
                finally {
                    scanner.close();
                }
            }
            // file does not exist
            else {
                Log.warning(Geonet.STOPWORD_PARSER, "Did not find requested stopwords file: " + file.getAbsolutePath());
            }
        }
        catch(IOException x) {
            Log.error(Geonet.STOPWORD_PARSER, x.getMessage());
            x.printStackTrace();
            Log.info(Geonet.STOPWORD_PARSER, "This exception is swallowed");
        }
        return stopwords;
    }

    /**
     * Parses one line of a stopwords file. A line may contain 0 or more stopwords separated by whitespace. Any content
     * after the character | is ignored.
     *
     * @param line line to parse
     * @return set of stopwords, or null if none found
     */
    private static Set<String> parseLine(String line) {
        Set<String> stopwords = null;
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("\\|");
        if(scanner.hasNext()) {
            String stopwordsPart = scanner.next();
            Scanner whitespaceTokenizer = new Scanner(stopwordsPart);
            while(whitespaceTokenizer.hasNext()) {
                String stopword = whitespaceTokenizer.next();
                if(stopwords == null) {
                    stopwords = new HashSet<String>();
                }
                stopwords.add(stopword);
                Log.debug(Geonet.STOPWORD_PARSER, "Adding stopword: " + stopword);
            }
        }
        return stopwords;
    }

}