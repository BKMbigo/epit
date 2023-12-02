package epit.dsl.voyager

import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
enum class Voyager(
    internal val moduleName: String
) {
    voyager_navigator("cafe.adriel.voyager:voyager-navigator"),
    voyager_bottom_sheet_navigator("cafe.adriel.voyager:voyager-bottom-sheet-navigator"),
    voyager_tab_navigator("cafe.adriel.voyager:voyager-tab-navigator"),
    voyager_transitions("cafe.adriel.voyager:voyager-transitions"),
    voyager_androidx("cafe.adriel.voyager:voyager-androidx"),
    voyager_koin("cafe.adriel.voyager:voyager-koin"),
    voyager_hilt("cafe.adriel.voyager:voyager-hilt"),
    voyager_kodein("cafe.adriel.voyager:voyager-kodein"),
    voyager_rxjava("cafe.adriel.voyager:voyager-rxjava")
}
