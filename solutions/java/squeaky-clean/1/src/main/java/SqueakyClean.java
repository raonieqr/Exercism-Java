class SqueakyClean {
    static String clean(String identifier) {
        String aux = identifier.replaceAll(" ","_").replaceAll("(\0|\r|\u007F)", "CTRL")
            .replaceAll("\\p{So}+", "").replaceAll("[0-9]", "").replaceAll("[α-ω]", "");
        StringBuilder sb = new StringBuilder(aux);

        for (int i = 0; i < aux.length(); i++)
        {
            if (sb.charAt(i) == '-' && 
                (sb.charAt(i + 1) >= 'a' && sb.charAt(i + 1) <= 'z' ||
                sb.charAt(i + 1) >= 'ḁ' && sb.charAt(i + 1) <= 'ỿ'))
            {
                char tmp = Character.toUpperCase(sb.charAt(i + 1));
                sb.setCharAt(i+1, tmp);
            }
        }
        return (sb.toString().replaceAll("-", ""));
    }
}