package Model;

import GUI.GUI_SPPK;

/**
 *
 * @author budhidarmap
 */
public class NaiveBayes {

    double Xyes;
    double Xno;
    String hasil;

    public String check(String a, String b, String c, String d) {
        //kemungkinan
        yes(a, b, c, d);
        no(a, b, c, d);
        if (Xyes >= Xno) {
            hasil="Iya Ada Peluang Dia Membeli";
        } else if (Xyes < Xno) {
            hasil="Tidak Ada Peluang Dia Membeli";
        }
        return hasil;
    }

    public double yes(String a, String b, String c, String d) {//P(buys_computer_yes)
        Probabilitas pro = new Probabilitas();
        double x1;
        double x2;
        double x3;
        double x4;
        double yes;

        yes = pro.p_buys_computer_true();
        if (d.equals("excellent")) {
            x1 = pro.p_credit_rating_excellent_n_buys_computer_true();
            if (c.equals("yes")) {
                x2 = pro.p_student_true_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                }
            } else if (c.equals("no")) {
                x2 = pro.p_student_false_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                }
            }
        } else if (d.equals("fair")) {
            x1 = pro.p_credit_rating_fair_n_buys_computer_true();
            if (c.equals("yes")) {
                x2 = pro.p_student_true_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                }
            } else if (c.equals("no")) {
                x2 = pro.p_student_false_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xyes = (x1 * x2 * x3 * x4) * yes;
                    }
                }
            }
        }
        return Xyes;
    }

    public double no(String a, String b, String c, String d) {//P(buys_computer_no)
        Probabilitas pro = new Probabilitas();
        double x1;
        double x2;
        double x3;
        double x4;
        double no;

        no = pro.p_buys_computer_false();
        if (d.equals("excellent")) {
            x1 = pro.p_credit_rating_excellent_n_buys_computer_true();
            if (c.equals("yes")) {
                x2 = pro.p_student_true_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                }
            } else if (c.equals("no")) {
                x2 = pro.p_student_false_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                }
            }
        } else if (d.equals("fair")) {
            x1 = pro.p_credit_rating_fair_n_buys_computer_true();
            if (c.equals("yes")) {
                x2 = pro.p_student_true_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                }
            } else if (c.equals("no")) {
                x2 = pro.p_student_false_n_buys_computer_true();
                if (b.equals("low")) {
                    x3 = pro.p_income_low_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("medium")) {
                    x3 = pro.p_income_medium_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                } else if (b.equals("high")) {
                    x3 = pro.p_income_high_n_buys_computer_true();
                    if (a.equals("<30")) {
                        x4 = pro.p_age1_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals("30...40")) {
                        x4 = pro.p_age2_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    } else if (a.equals(">40")) {
                        x4 = pro.p_age3_n_buys_computer_true();
                        Xno = (x1 * x2 * x3 * x4) * no;
                    }
                }
            }
        }
        return Xno;
    }
}
