class Badge {
    public String print(Integer id, String name, String department) {
        String depart = department != null? department.toUpperCase(): null;
        String otherDepart = "OWNER";
        
        if (id == null) {
            return name + " - " + elvis(depart, otherDepart);
        }
        return "[" + id + "]" + " - " + name + " - " + elvis(depart, otherDepart);
    }

    public String elvis(String value, String fallback) {
        return (value != null && !value.isEmpty()) ? value : fallback;
    }

}
