class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return (!knightIsAwake);
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       if ((!archerIsAwake && !prisonerIsAwake) || archerIsAwake)
            return (false);
        return (true);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return ((!archerIsAwake && !knightIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent));
    }
}
