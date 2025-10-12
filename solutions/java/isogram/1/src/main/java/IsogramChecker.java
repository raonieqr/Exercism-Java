class IsogramChecker {

    boolean isIsogram(String phrase) {
        String aux = phrase.toLowerCase();
        
        if (aux.isEmpty())
            return (true);
        if (aux.charAt(0) == aux.charAt(aux.length() - 1) || aux.charAt(0) == aux.charAt(aux.length() / 2))
            return (false);
        for (int i = 0; i < phrase.length() - 1; i++)
        {
            if (aux.charAt(i) == aux.charAt(i + 1) || aux.charAt(0) == aux.charAt(aux.length() - 2))
                return (false);
        }
        return (true);
    }

}
