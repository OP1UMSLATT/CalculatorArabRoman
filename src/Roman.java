public enum Roman {
        I(1),II(2),III(3),IV(4),
        V(5),VI(6),VII(7),VIII(8),
        IX(9),X(10),XI(11),XII(12),
        XIII(13),XIV(14),XV(15),XVI(16),
        XVII(17),XVIII(18),XIX(19),XX(20),
        XXI(21),XXIV(24),XXV(25),XXVII(27),
        XXIII(28),XXIX(29),XXX(30),XXXII(32),
        XXXV(35),XXXVI(36),XL(40),XLII(42),
        XLV(45),XLVIII(48),XLIX(49),L(50),
        LIV(54),LVI(56),LX(60),LXIII(63),
        LXIV(64),LXX(70),LXXII(72),LXXX(80),
        LXXXI(81),XC(90),C(100);

        private int translation;

        Roman(int translation){
            this.translation = translation;
        }

        public int getTranslation(){
            return translation;
        }


        public static Roman getByValue(int value){
            for(Roman rn: Roman.values()){
                if(rn.getTranslation() == value){
                    return rn;
                }
            }
            throw new RuntimeException("throws Exception");
        }
}
