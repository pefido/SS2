package HMS;

public class MedRecord {
    private int patientId;
    private PatReport report;
    private MedCaseInfo caseInfo;
    private AdminInfo adminInfo;
    private InternalInfo internalInfo;
    
    public MedRecord HMS$MedRecord$(final int patientId) {
        this.jif$init();
        {
            this.patientId = patientId;
            this.report = null;
            this.caseInfo = null;
            this.adminInfo = null;
            this.internalInfo = null;
        }
        return this;
    }
    
    public int getPatientId() { return this.patientId; }
    
    public PatReport getPatReport() { return this.report; }
    
    public MedCaseInfo getMedCaseInfo() { return this.caseInfo; }
    
    public AdminInfo getAdminInfo() { return this.adminInfo; }
    
    public InternalInfo getInternalInfo() { return this.internalInfo; }
    
    public void setReport(final PatReport report) { this.report = report; }
    
    public void setCaseInfo(final MedCaseInfo info) { this.caseInfo = info; }
    
    public void setAdminInfo(final AdminInfo info) { this.adminInfo = info; }
    
    public void setInternalInfo(final InternalInfo info) {
        this.internalInfo = info;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.4.3";
    public static final long jlc$SourceLastModified$jif = 1450353208000L;
    public static final String jlc$ClassType$jif =
      ("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" +
       "NqxamUgp6aO3DB69be/WOTDRV4g/Z6Hglq619WI6rZkejTulIknZdyyePEUX" +
       "BNPdNL6zLzyn/pbO837wfJRF+gRvRVkrZnpIRnhJPdJx12tzKylXLmOw4z9t" +
       "uPmuux//8Xm06JQSS5UvXyHgH5q0yhRKbBOQeaZ4sdAqKgbDw/iPquP6moY3" +
       "MS5GElslyUpekTYDwrzVpN4+CiUFVpbd1snTfCc3OofrUKol0JDIhu4iyHNu" +
       "a9ky8RbbNe6eJyv+cXClBZZlCJYVHp0Js0qvim2ySMo8nb9T+mj3K3Lb+Z8c" +
       "p/la6097twM6WclKii7CloB9gp2EgVxgzibiiYk+OzL2i+944NFjr7euwLTG" +
       "RRCs93xbDs4kDvYngCIzGOZXsH6xtx61EE1nO0LYQteuHiDr77So2sJ3Slve" +
       "HDep5ljHmd71jQVTDweOcsdD3y7+YP4nD6Cx7Oif6Yl+myA0A0B7gQ4emud2" +
       "t09i3u0npiqPvfzsCRZWXqAEUSxfNPZn706cdC2GFlnCFbOwtiPZo+4qzTS1" +
       "FKf00pmvbKw79cI/W0hrs11TFeSa5Z70P8cto4e9K2XMfWLSjle3tVgTXaYH" +
       "wfdysk924FtV2/T0z4vb/o2DL2KSuKcfT6QIhbaZRhm0najClXQAP39VDxoi" +
       "C2XXerVJk0TVWaOt+8bBI4vve3cQgVSo8ktI75bKQ6nuUQ82/X7zL6kbvatx" +
       "rmB1Sou+l/o4Wl30TFQoJsthTNlk43+ZqGZhidRB9rGZejbYJIx2HXfvSekG" +
       "rI7b+y32LBb54loAojg1f4y75s9nzr4kqOZHBPzQgyTV2M6C5mxrOVaYVAi+" +
       "2Wrsc/IXIf+fwT/whgHoifT1bB9XZW/kdGRdj6QLoTl3wMqaXpMTjKXIErOP" +
       "7WLlW3fe9nntjp1Rbqs/07fb5mnodp8ueaBJAZxnhM2CFGv++9GtTzy4dTv1" +
       "bYV747o6nU19/z9OHa69981nA/ZXMVI6sM5CY+DU56Cu87CNg13QijRCaE0j" +
       "ezDvQRxogGYGWRqUJ+h+qUpnKwM4sAXPWRtcNmDwEkoO7XXunZuTLNZpOpcp" +
       "Noz/93lTn7zy63amoBxwLe1KAjwZnwEmjHvtxUN9a49zGQC66xkf6G6gQxsc" +
       "4W52IneGP5jdQw06rbK3Dam8jrzvoIx0N1/31w301EEqqu4S0/lK+4non0Jf" +
       "YlkDl66cmJe2LH1n8LNesvmLdQhjesRMY5pgDK6UyQauL+xvpnAGV0dxIVk3" +
       "VC7yTNYRf/jbk+uX/Q7h6Ow0gXo6apa0Y3+kwK5xFJL/JtYHxf63csZ+MQEP" +
       "KZqyZy9WwpgtZP1cjqlrzYaB7xZoEqNZGSQQdbtNMDqIwLWSxm7PkPiwOY6B" +
       "wYmM0wrW+9YnD+L5f81gsJ6vwwgp93LHy265T6OvcmGwF2d4zMH8Xn8Y2EOY" +
       "WKApFzhN73VbFHbERZiCaX95gIv3URdDs9vvS6C6jPUtLl+SlaOuGWaQI6cz" +
       "AjVoWo8jzwwiuMbnyCfzd+RYGKxknDaxXvQ68ql8HTktiN3GUEfuxxkOOV7b" +
       "73eke2gcuyTXKpptaFbOs08GefYCgV6xfIT11wd49lehngWq61jf7/LsCEnM" +
       "kL16UgvybZyR7Ama2OPbcUEEt7l8S9Vfq3t8iBvlWkbxXdbf7qLM7T9DmBtU" +
       "4xqUzMZsWoIaz9W61TuO7us//PwcmjUT7BxubY/F7xUofrXu4hfEjy+CLWvu" +
       "fPePcz4+5imCbvRGfWoUNWj23RCXes1iWuyWjQEHZ0eQ73sOqI74cXbEi7My" +
       "dum3njmZIc1ZaRzxeoUaAO3+Ko68TkegfStQKRh6G5p3OAk9CF4i0Ct377D+" +
       "JwEI/jgUwUD1OOt/4EJwiQhAyAXh+Yzm1aCZg9KTl+DpfCCMaWgeo3iF9f+S" +
       "J4QtK0dYdnszP+wUtptiMpkPdE6BYyKjHZyc8kPnVGCKWmmZ1gecUwHAIQqA" +
       "tmxpy1SCtjAXcCLF0Izk5PMAZzF1f2Qag8GHfuBEJoUCB/5PsP49F3BK8WZi" +
       "GrZ4wdg5m01eFjS5BzvjgwhOuRAAslblX9pwUTGbcRzDOH7GcwSGNeG4CkKG" +
       "DYwIrsUj820URPxrcc8QAUY5AKORMx3DBqo34PjiLFsT/INKGmOhAv0YThM8" +
       "c6K1DTKEabluiOJebc+NO3cnWvYutHKtSXKAqekLVLlPVjlWJb57+814C9hZ" +
       "RS/5TkPN1Kd7d/z57lrB1ynBN6ime5TyCvNQ88PPXnSWNEj2D/a9Kd9tbTeR" +
       "99o6nXWd6yJApe0GvEk0i+a5yAnWv+gBlFAe5EH71guQ/Ib1z3s9GLjfjawK" +
       "OQapJLKUhGK3bLbm2C6g2BPZnG8Hie0JxdIggiO+UFybfyjiBmQC43SU9S95" +
       "Q7Ep31Xm+CB2b/k04laZkUacYZ0Tlo3+SLWHoDXCLjBElqGrr4WPHUOawSaI" +
       "XI0D19MB/Gxtmf1DGxyyLkfGZX6xl/Fi4x4/8hW38+dRc0XrWD9peJgFkoms" +
       "r8gPs2rIMbi1FOm2MdsWtDNCsSvZnLVBYnswWxFEUO3DrJE/ZnExM41xWsD6" +
       "mV7M9uWL2alB7OaHYjaDM1zneDrjd36Gd/7zoZjtcTD7N3lhFgki2x2A9vgx" +
       "2+PHLCX7hiNjj1/sniExu5T8TyEmuov1vj1pOGaB5BrWd+SH2btDjt0Lzd+Z" +
       "whiCWW47EITaWjbrLUGCe1A7NohAdaE2x4IZd4sLGMXNrE+5KMORiavLB4a1" +
       "YM5/sxXZhVb7vuPwXX4M7OIxcDwUuoMOdP8pL+giQeRHDk4H/dAd9EOXkj3h" +
       "yDjoF3twSOj+lYAXaaLvs37/8KALJE+y/kf5QfeZkGMHoXmKptuVOXZ6dpWA" +
       "Od8IEjso3XoJfpEPcDGtzmUUr7P+4HCB+6vTs9OLHEaT/dbx9mE/AA5zAIhU" +
       "hOL2gIPbo3nhFgki/+WA9IAftwf8uKVk/+PIeMAv9oEhcQsXGWaSzUU968cN" +
       "D7dAMpb1vs1JMDZ/H3LsD9B8YAplBLeNuTeaKPlsNu25QZJ7oDsuiIB/Coqu" +
       "FP6U/0oBl6NnMU6LWF/tMV7ks3BYh280TwKLaJHjzZN+B5/kcbkwFJcnbFxG" +
       "S/PCJRJEyxwQnvDj8oQfl5RsrCPjCb/YJ4bE5QTqsNhW1mvDwyWQpFnfkxuX" +
       "1jNjbnjBfR+8fgzU97PedVUWTz3PJlgQRHAnT2AKXXk9tURvGcAR+uR1VUZm" +
       "i+Wg55bY7s96bokaeKlO7QlemExNBR+nhKkOJ7DLEOfB52r04UwQPlozPH7+" +
       "m/zr05vSWn+a3pxuH/Vw9qb9C16yrkOw+8043/zcmSF6DjSTTKHENggMkGWU" +
       "H/EBj1IwEdjzTmPj7+9q+ePRxywZllDVdN5+0XM9g+77OQ3USmigC/LPGrDs" +
       "w6UCAGQ363d6oB290J8cmKdpBNnslgSx2+UDKre/YJ5tsEORDHij0zOUcMfF" +
       "CjbNPwTFBb24GG2ksYktf1MUPqpo8pTn9hgFIFoTvj/vgyI0LQjHQDvDEZgp" +
       "2mzxiDYiIzwyOwRYbQgsaGgC0Ckg8XPGFAr6NCUh5MqrtmnwuuNMZpKvW7mL" +
       "Nw0a5vL8oQKbb3wSEjjdyvrrvFC5KrzAOFCZEcRueyhUrsAZJAcXV/ihcoUr" +
       "kZPZqVNnB3mhMsQLGx0vQNMeYHG0X2+uegF3usnaNHaU9b/2WGqIegEkL7D+" +
       "OY40r3pxHnC5klIXVDMursvYnnqxPICgYARPYAqpvOoFvK3hrhbWNjX8OVe6" +
       "q5vP1hxBpSPlpPr0UKUjw5WO7JcvO0zbPyzR4VAtImpbCChvhEY1hVGcaL25" +
       "qk6vVTNSQYUkxRcSfMfGKSPZnPsmTA1XMHzMYH2JK6uExz/sm6J3nKYNPxEc" +
       "2m862SDrTxDZHLUEY2YDU2l2UMywWnJ/PrXEsSiPx2DrUpMg7x28kaAdzHXP" +
       "LQpFOnoPVRhOOf4XgHhoUaLvnm51o/ejzvh9S0jE/BAjBpqbenOkcU/hhLwt" +
       "nMv8/6mVxF0QzxEck4FyEaM4yfq3hxscj5+u4NiHBnnGiYR9/uDY56mehQCQ" +
       "2V+mM3tDnPlCvs6kqgSI+jgV9Se8uaHdn1PUn0PzNDVdb65aD54nUhR0sv5S" +
       "3um9Q9Z6IGlm/UUcaf61/jJG/S3Wb+YF8NT6pUEEN/IEXzx72Jf2wtMHXgkL" +
       "q/UvOwXzlaFq/RtcrX/ry5cdpn17WKL32rX+/RCwH4fmJVMo5UXrHbLYvxxU" +
       "7F8OKfZv5cxny4D1egaQb7L+puHms09Oz0VSIjdpY87FKDLgS2dvhdX6q5hG" +
       "DwTFDK31sVFfoNa/MRBiXGoRBM2feBtB+1muJBQToIlRhQFoFX8BiIf2P0Gi" +
       "stOtbmwU6oxE7+SOmFglRgw0H/TmV+snW7Ue/D9gJXEXwnPExhSr1gNFP+vd" +
       "z8AOHRuxmtMTGzF8Iii20A6EmP+JIGeoN7jUn35fvhbiy6X5+pKq4heV2BYj" +
       "eBZvbWjn5BR1HjS11HS9uUr9NIqYgt+y/hDv894hSz2QHGT9AY40r1J/DnC5" +
       "lFIXjmZcPuAF8JT6C4MITvIEprDxCyYP/m5IeP7IXedjq+1iGVszRJ2PXeLU" +
       "+VgzeulS9HDLsPj1WsU3dnkI/DBCGkyhzKNo71D1l0jgr7/8oLf+ElVQC5EC" +
       "OACbvgtxuIBrZl4tZV791IPDWCI8/4Te6WH2VZ1s0exPIM05iiuitJ2JVxGE" +
       "UlZce4dfXAkI0Fjg8IU+OEDTj5AINCMcaYUma/GI9SIjPNIWAoctCAdoOsKz" +
       "kW0EfAUhzpQ/buUM3ghogq/l73V4rAgv1wOnY6x/zev1bf8fr29FFrc6Lt7q" +
       "9/rWwLIRZNDGEIP+7dAGRfPgJCRJldg/fAJvhk70/R4S/Q0f6ZHdZSMm7F5/" +
       "BH9HwH7XsqRJGJHMqir/iiX3uUg35KSCeCvBdgy+VRa70xRia5vb4eNO57FZ" +
       "fO8dXuqspS91DtBkMJGHQbDO97l/CAIeZM3Sn4fqlE4sWtjws0NnHWTvFtv6" +
       "yQNmLf5wlPW0qU3x6O6LL732w8X0pyMKJVXcAiAVRjQJxTR3owzwWxgzcnKz" +
       "eBWtnXNyzGMls+xfP4CmgqtmLu24J3yn+94953+6qlPaJGy9/V+3V9xAhOwQ" +
       "SpTMOiObMeFHpEok61lg99vo8MM09q8z0Vth9LXB2N/bb5lz71xzk/GvcUQ2" +
       "3tfSVPz5FeEv6GOeKf8/yGZFST5MAAA=");
    
    public MedRecord() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.0";
    public static final long jlc$SourceLastModified$jl = 1450353208000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK17ecz02lnf3O/mLkkuuUkggYQsl+SyJIbrbWyPuYR2xuPx" +
       "eBt77LHH4wgu3vdlvM9AWFq1RFDRhYTSCvJPQW1RGtpKlNKCBK0oUCgSS0uR" +
       "SkEtaosACf5o+09b6pn3/db75Wuu1JF8Hr9nec7vnPNsR37ez/7x5Jm6mrxU" +
       "FukpSIvmleZUevUrslXVnkulVl3vxorXnE8D4Kf+5je//R8/PXnRnLwY5Wpj" +
       "NZFDFXnjDY05eSHzMtur6rnreq45eUfuea7qVZGVRuexY5Gbk3fWUZBbTVt5" +
       "teLVRdpdOr6zbkuvus55t1KYvOAUed1UrdMUVd1M3i7EVmeBbROloBDVzavC" +
       "5Fk/8lK3Pk6+ffKUMHnGT61g7Phu4e4qwCtHcHWpH7u/JRphVr7leHeHvCmJ" +
       "creZfPDREfdW/DI/dhiHPpd5TVjcm+pNuTVWTN55Aym18gBUmyrKg7HrM0U7" +
       "ztJM3vt5mY6dni8tJ7EC77Vm8mWP9pNvmsZeb75uy2VIM3nXo92unIZq8t5H" +
       "zuyB0/rjzTd837fm6/zOFbPrOekF/zPjoA88MkjxfK/ycse7GfjCR4UfsN79" +
       "M5+8M5mMnd/1SOebPj/5bX/657/2Az/7izd9vvwxfSQ79pzmNedH7Lf92vuo" +
       "j5BPX2A8XxZ1dBGFh1Z+PVX5tuXVoRxl8d33OF4aX7nb+LPKvzp85495f3hn" +
       "8hZ28qxTpG02StU7nCIro9SrGC/3KqvxXHbyZi93qWs7O3lufBei3LuplXy/" +
       "9hp28qb0WvVscf173CJ/ZHHZojeN71HuF3ffS6sJr+9DOZlMnhufybvH5+nx" +
       "efmWvquZrMCwyDyw9PzILcBl4bSZlzc1SNcjTAuE/8U/e0n1Mm+UaQ9UVbBE" +
       "xhIB16IKip6reE5Rua/EkV/+f+M0XDB/Uf/UU+N2vu9R1U5HPVgXqetVrzmf" +
       "ahf0n37utV++c0+4b1fbTL5o5PrKPa6Tp566cvuSi+DfHMy4rcmorqNGvvAR" +
       "9Zu4b/nkh8btGMr+TeOmXLq+/Kh83tdqdnyzRqF7zXnxu//b//jxH/hEcV9S" +
       "m8nLr1Og14+8KMCHHl1ZVTieOxqY++w/+pL1E6/9zCdevnM5zTePdqWxxpMf" +
       "lfQDj87xkCK8eteoXHbjjjB5q19UmZVemu5agrc0YVX092uuW/7W6/vb/mz8" +
       "PTU+/+fyXGTmUnGho+WgbuX1pXsCW5Y3x3XZ3UdWdDVgH1PLH/73v/oH6J0L" +
       "kru27sUHjKLqNa8+oF8XZi9cNekd9w9rV3ne2O93flD+/k//8Xd//HpSY48P" +
       "P27Cly/lBac14iuqv/SLx9/+3f/4I7955/7pNpNny9ZOI+eK/H0jo6+6P9Wo" +
       "eumo/iOS+mUtzwo38iPLTr2LpPyvF78S/ok/+r633xx3OtbcbF41+dr/N4P7" +
       "9e9ZTL7zl7/5f37gyuYp52L672/H/W439uSL73OeV5V1uuAYvuvX3/+3fsH6" +
       "4dEyjdagjs7eVcEn1+VNrqsCrmf5Vdfyo4+0fd2l+PLh2vaua/3z9ett6+ri" +
       "pO7Logl+9ofeS33jH15B35fFC4/3Dq/XU916QE2QH8v++50PPfvzdybPmZO3" +
       "X/2jlTe6lbaXUzVHD1dTt5XC5Isean/YW92Y5lfv6dr7HtWDB6Z9VAvu24fx" +
       "/dL78v7cg4I/bsRbJre28ZnxEW4pcml9e3kp3zE8Nbm+oNchH7iWX3EpXr4r" +
       "W8+VVdSNmjHcY3rnwvTNt8zgW/rRB5g2kzePpjoabSXrPuYk5CrKRt3obr2c" +
       "98lPfc+fvfJ9n7rzQCjw4dd54wfH3IQD16W+5SrywzjLVzxpluuI1X/98U/8" +
       "87/3ie++cZXvfNix0Xmb/YN/979/5ZUf/L1feoz9fXoMWm7swqUEH97grx6f" +
       "Z68G5YbuH7PB85sNvhT463fyMkq/pdJDO/ls5ZVF1VyHvPPWD8hWo1xrPy8i" +
       "8tY/fu6WfsdjEK2fiOgy6ttvaf8Qoucdqx6Nul/cxfTirW+ibus/Lyrioprj" +
       "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" +
       "k9QrB3sb1BYTUBCVBDNDZlbzCt9QWoiJ");
    public static final String jlc$ClassType$jl$1 =
      ("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" +
       "S7gM+Y1b+m8+/xIeRPjJJ7R9z6X4i83khcBr5Lv5N9eFPw47MD5fOoJ59Za+" +
       "541hvwz5slv6zi8M+19/Qtv3X4q/cg/7/fSW1eOwf2x8vnyc+NO31Hpj2C9D" +
       "vuWWml8Y9r/9hLYfuhSfHqVmxP5IGoz4OPSz8fngOPUf3dKfeWPoL0N++pb+" +
       "ky8M/d95QtuPXorP3Oz8Q9kyu8dhv6TwfHi0VdQtfdcbw34Z8iW39HW27vH4" +
       "PvuEts9dir/bTF4csT+aUfPxx8EfpfWSrfX0J25p8cbgX4bktzT8gmzO6sr1" +
       "J56whp+8FP9wtNa1dyv2j82A6YrIfdyK3nOjyk//p1v6629sRZchv3ZLf/kL" +
       "WpF45fpzT1jRv7wUP92MrsZrHlSGn3oc/veODziZvOm1W7p5Y/gvQ8RbynxB" +
       "+HdXrv/6Cfh/5VL8/KgR9SMa8dgFXPLG0HH2/3BLf/GNLeAy5Bdu6c99QQv4" +
       "+JXrbzxhAf/2UvzqqBb169Xi0TVcMEzeceE9ufldaTP5c69Pjf76l46tVUfH" +
       "tmi8r7nNCn3pIpcvjdHOy1EeNV/zkZe+9aWPf5P60ic+ci+P+t7i72fOXX/P" +
       "PTrnpfW3y/IJ6/qdJ7T97qX4rWby/F0s18UOo17d8+OX9OMve92/1tz8A4jz" +
       "uc+8+PyXfkb7rWtu+r1/0nhWmDzvt2n6YK7tA+/PlpXnR9f5n73JvL1Z9X9u" +
       "Jk+PIcTl9ffLx2Tc3eT9Dv8XwuYPSO8zAAA=");
}
