package trie;

import java.util.HashMap;

/**
 * A Trie or Prefix Tree an efficient data lookup structure - often used to
 * store large collections of words or dictionaries. With a Trie, search
 * complexities can be reduced to O(k) where k is the key or word length. The
 * autocorrect on your iOS or Android keyboard uses a Trie of the most commonly
 * used words along with fuzzy match algorithms to autocorrect and autosuggest
 * words as you type. You're given a completed TrieNode class that represents
 * one node of a Trie, and a partially complete Trie class. Your task is to
 * complete the insertWord, searchWord and searchPrefix methods on the Trie
 * class. Take a look at the examples below to see what each of these do.
 * 
 * @author Devashri
 *
 */
public class TrieNode {

	HashMap<Character, TrieNode> children;
	boolean isEndOfWord;

	public TrieNode() {
		children = new HashMap<>();
		isEndOfWord = false;
	}

}
