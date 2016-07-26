package trie;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insertWord(String word) {

		if (word == null || word.length() == 0) {
			return;
		}

		TrieNode cur = root;
		for (int i = 0; i < word.length(); i++) {
			Character ch = word.charAt(i);
			TrieNode node = cur.children.get(ch);
			if (node == null) {
				node = new TrieNode();
				cur.children.put(ch, node);
			}
			cur = node;
		}

		cur.isEndOfWord = true;

	}

	public boolean searchWord(String word) {
		if (word == null || word.length() == 0) {
			return false;
		}
		TrieNode cur = root;
		for (int i = 0; i < word.length(); i++) {
			Character ch = word.charAt(i);
			TrieNode node = cur.children.get(ch);
			if (node == null) {
				return false;
			}

			node = cur;
		}

		return cur.isEndOfWord;

	}

	public boolean searchPrefix(String word) {
		if (word == null || word.length() == 0) {
			return false;
		}
		TrieNode cur = root;
		for (int i = 0; i < word.length(); i++) {
			Character ch = word.charAt(i);
			TrieNode node = cur.children.get(ch);
			if (node == null) {
				return false;
			}

			node = cur;
		}

		return true;
	}
}
