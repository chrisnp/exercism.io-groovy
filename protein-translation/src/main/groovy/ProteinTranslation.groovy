class ProteinTranslation {

    static List<String> proteins(String strand) {
        strand.toList()
              .collate(3)
              *.join()
              .collect {
                  (it =='AUG')       ? 'Methionine'    :
                  (it =~ /UU[CU]/)   ? 'Phenylalanine' :
                  (it =~ /UU[AG]/)   ? 'Leucine'       :
                  (it =~ /UC[ACGU]/) ? 'Serine'        :
                  (it =~ /UA[CU]/)   ? 'Tyrosine'      :
                  (it =~ /UG[CU]/)   ? 'Cysteine'      :
                  (it == 'UGG')      ? 'Tryptophan'    :
                  (it == 'UGA')      ? 'STOP'          :
                  (it =~ /UA[AG]/)   ? 'STOP'          : 
                  '' }
              .takeWhile { it != 'STOP' }
    }
}