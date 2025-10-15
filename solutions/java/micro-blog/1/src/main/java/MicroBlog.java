class MicroBlog {
    public String truncate(String input) {
        final int MAX_SIZE_WORD = 5;
        return input.codePoints()
            .limit(MAX_SIZE_WORD)
            .collect(StringBuilder::new,
                     StringBuilder::appendCodePoint,
                     StringBuilder::append)
            .toString();
    }
}
