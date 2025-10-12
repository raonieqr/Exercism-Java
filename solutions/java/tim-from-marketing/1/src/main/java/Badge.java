class Badge {
    public String print(Integer id, String name, String department) {
        String depart = department != null? department.toUpperCase(): null;
        String otherDepart = "OWNER";
        
        if (id == null) {
            return String.format("%s - %s", name, elvis(depart, otherDepart));
        }
        return String.format("[%d] - %s - %s", id, name, elvis(depart, otherDepart));
    }

    public String elvis(String value, String fallback) {
        return (value != null && !value.isEmpty()) ? value : fallback;
    }

}
