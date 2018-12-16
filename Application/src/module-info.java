module Application {

    requires Percentage;   // No need to import modules for division and multiplication,
                            // as it is already used in Percentage module using transitive keyword
    requires Subtraction;
    requires Addition;
}