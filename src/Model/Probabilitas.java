package Model;

import Connection.DatabaseManager;

/**
 *
 * @author budhidarmap
 */
public class Probabilitas {

    public double p_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_credit_rating_fair() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getCredit_rating().equals("fair")) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_credit_rating_excellent() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getCredit_rating().equals("excellent")) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_student_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].isStudent() == true) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_student_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].isStudent() == false) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_income_low() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getIncome().equals("low")) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_income_medium() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getIncome().equals("medium")) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_income_high() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getIncome().equals("high")) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_age1() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getAge() < 30) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_age2() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getAge() > 30 && d[total].getAge() <= 40) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_age3() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index = 0;
        int total = 0;
        double dIndex;
        double dTotal;

        for (Data d1 : d) {
            if (d[total].getAge() > 40) {
                index++;
            }
            total++;
        }
        dIndex = index * 1.0;
        dTotal = total * 1.0;
        return dIndex / dTotal;
    }

    public double p_credit_rating_excellent_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getCredit_rating().equals("excellent")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_credit_rating_excellent_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getCredit_rating().equals("excellent")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_credit_rating_fair_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getCredit_rating().equals("fair")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_credit_rating_fair_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getCredit_rating().equals("fair")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_student_true_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].isStudent() == true) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_student_true_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].isStudent() == true) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_student_false_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].isStudent() == false) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_student_false_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].isStudent() == false) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_income_low_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getIncome().equals("low")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_income_low_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getIncome().equals("low")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_income_medium_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getIncome().equals("medium")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_income_medium_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getIncome().equals("medium")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_income_high_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getIncome().equals("high")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_income_high_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getIncome().equals("high")) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_age1_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getAge() < 30) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_age1_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getAge() < 30) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_age2_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getAge() > 30 && d[total].getAge() <= 40) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_age2_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getAge() > 30 && d[total].getAge() <= 40) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_age3_n_buys_computer_true() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == true) {
                if (d[total].getAge() > 40) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
    public double p_age3_n_buys_computer_false() {
        DatabaseManager db = new DatabaseManager();
        Data[] d = db.getListData();
        int index1 = 0;
        int index2 = 0;
        int total = 0;
        double dIndex1;
        double dIndex2;

        for (Data d1 : d) {
            if (d[total].isBuys_computer() == false) {
                if (d[total].getAge() > 40) {
                    index1++;
                }
                index2++;
            }
            total++;
        }
        dIndex1 = index1 * 1.0;
        dIndex2 = index2 * 1.0;
        return dIndex1 / dIndex2;
    }
}
