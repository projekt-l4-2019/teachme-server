

CREATE TABLE public.adminn (
    id_admin integer NOT NULL,
    login character varying(127) NOT NULL,
    pasword character varying(4000) NOT NULL,
    email character varying(127) NOT NULL
);


ALTER TABLE public.adminn OWNER TO zpdvzfaemzaact;

--
-- TOC entry 197 (class 1259 OID 7818974)
-- Name: city; Type: TABLE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE TABLE public.city (
    id_city integer NOT NULL,
    name character varying(127) NOT NULL,
    voivodeship_id_voivodeship integer NOT NULL
);


ALTER TABLE public.city OWNER TO zpdvzfaemzaact;

--
-- TOC entry 203 (class 1259 OID 7821866)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO zpdvzfaemzaact;

--
-- TOC entry 198 (class 1259 OID 7818979)
-- Name: meeting; Type: TABLE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE TABLE public.meeting (
    id_meeting integer NOT NULL,
    date date NOT NULL,
    "time" time(6) with time zone NOT NULL,
    subject_id_subject integer NOT NULL,
    user_id_user integer,
    meeting_place character varying(127)
);


ALTER TABLE public.meeting OWNER TO zpdvzfaemzaact;

--
-- TOC entry 199 (class 1259 OID 7818992)
-- Name: notice; Type: TABLE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE TABLE public.notice (
    id_notice integer NOT NULL,
    look_or_offer character(1) NOT NULL,
    note character varying(512) NOT NULL,
    meeting_place character varying(127) NOT NULL,
    meeting_date date NOT NULL,
    price double precision,
    subject_id_subject integer NOT NULL,
    active character(1) NOT NULL,
    "timestamp" timestamp with time zone,
    user_id_user integer,
    meeting_id_meeting integer NOT NULL,
    time_from timestamp with time zone,
    time_to timestamp with time zone,
    level integer
);


ALTER TABLE public.notice OWNER TO zpdvzfaemzaact;

--
-- TOC entry 204 (class 1259 OID 8666816)
-- Name: notice_id_notice_seq; Type: SEQUENCE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE SEQUENCE public.notice_id_notice_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.notice_id_notice_seq OWNER TO zpdvzfaemzaact;

--
-- TOC entry 3904 (class 0 OID 0)
-- Dependencies: 204
-- Name: notice_id_notice_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: zpdvzfaemzaact
--

ALTER SEQUENCE public.notice_id_notice_seq OWNED BY public.notice.id_notice;


--
-- TOC entry 200 (class 1259 OID 7819001)
-- Name: opinion; Type: TABLE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE TABLE public.opinion (
    id_opinion integer NOT NULL,
    rating integer NOT NULL,
    comment character varying(500) NOT NULL,
    user_to integer,
    user_from integer,
    user_id_user integer,
    user_id_user1 integer
);


ALTER TABLE public.opinion OWNER TO zpdvzfaemzaact;

--
-- TOC entry 3905 (class 0 OID 0)
-- Dependencies: 200
-- Name: COLUMN opinion.user_to; Type: COMMENT; Schema: public; Owner: zpdvzfaemzaact
--

COMMENT ON COLUMN public.opinion.user_to IS 'user komentowany';


--
-- TOC entry 3906 (class 0 OID 0)
-- Dependencies: 200
-- Name: COLUMN opinion.user_from; Type: COMMENT; Schema: public; Owner: zpdvzfaemzaact
--

COMMENT ON COLUMN public.opinion.user_from IS 'User komentuj�cy';


--
-- TOC entry 201 (class 1259 OID 7819009)
-- Name: subject; Type: TABLE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE TABLE public.subject (
    id_subject integer NOT NULL,
    name character varying(127) NOT NULL,
    subject_id_subject integer
);


ALTER TABLE public.subject OWNER TO zpdvzfaemzaact;

--
-- TOC entry 205 (class 1259 OID 8737607)
-- Name: userr; Type: TABLE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE TABLE public.userr (
    id_user integer NOT NULL,
    login character varying(127),
    name character varying(127) NOT NULL,
    surname character varying(127) NOT NULL,
    birth_date date NOT NULL,
    avatar character varying(127),
    phone character varying(127),
    email character varying(127) NOT NULL,
    timesstamp timestamp with time zone,
    password character varying(4000),
    city_id_city integer,
    about character varying(127),
    id_city integer
);


ALTER TABLE public.userr OWNER TO zpdvzfaemzaact;

--
-- TOC entry 202 (class 1259 OID 7819022)
-- Name: voivodeship; Type: TABLE; Schema: public; Owner: zpdvzfaemzaact
--

CREATE TABLE public.voivodeship (
    id_voivodeship integer NOT NULL,
    name_voivodeship character varying(127) NOT NULL
);


ALTER TABLE public.voivodeship OWNER TO zpdvzfaemzaact;

--
-- TOC entry 3735 (class 2604 OID 8738209)
-- Name: notice id_notice; Type: DEFAULT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.notice ALTER COLUMN id_notice SET DEFAULT nextval('public.notice_id_notice_seq'::regclass);


--
-- TOC entry 3887 (class 0 OID 7818966)
-- Dependencies: 196
-- Data for Name: adminn; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.adminn (id_admin, login, pasword, email) FROM stdin;
1	admin	hasz�o2	xd@dx.abc.pl
2	admin2	hasz�o	xd2@dx.abc.pl
\.


--
-- TOC entry 3888 (class 0 OID 7818974)
-- Dependencies: 197
-- Data for Name: city; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.city (id_city, name, voivodeship_id_voivodeship) FROM stdin;
1	Rzesz�w	1
2	Strzy��w	1
3	Nowogrodziec	9
4	Osiecznica	9
5	Warta Boles�awiecka	9
6	Jawor	9
7	Bolk�w	9
8	M�cinka	9
9	M�ciwoj�w	9
10	Paszowice	9
11	W�dro�e Wielkie	9
12	Karpacz	9
13	Kowary	9
14	Piechowice	9
15	Szklarska Por�ba	9
16	Janowice Wielkie	9
17	Je��w Sudecki	9
18	Mys�akowice	9
19	Podg�rzyn	9
20	Stara Kamienica	9
21	Kamienna G�ra	9
22	Lubawka	9
23	Marcisz�w	9
24	Luba�	9
25	�wierad�w-Zdr�j	9
26	Le�na	9
27	Olszyna	9
28	Plater�wka	9
29	Siekierczyn	9
30	Gryf�w �l�ski	9
31	Lubomierz	9
32	Lw�wek �l�ski	9
33	Mirsk	9
34	Wle�	9
35	Zawid�w	9
36	Zgorzelec	9
37	Bogatynia	9
38	Pie�sk	9
39	Sulik�w	9
40	W�gliniec	9
41	Wojciesz�w	9
42	Z�otoryja	9
43	Pielgrzymka	9
44	�wierzawa	9
45	Zagrodno	9
46	Jelenia G�ra	9
47	G�og�w	9
48	Jerzmanowa	9
49	Kotla	9
50	P�c�aw	9
51	�ukowice	9
52	G�ra	9
53	Jemielno	9
54	Niechl�w	9
55	W�sosz	9
56	Chojn�w	9
57	Krotoszyce	9
58	Kunice	9
59	Legnickie Pole	9
60	Mi�kowice	9
61	Prochowice	9
62	Ruja	9
63	Lubin	9
64	Rudna	9
65	�cinawa	9
66	Chocian�w	9
67	Gaworzyce	9
68	Gr�bocice	9
69	Polkowice	9
70	Przemk�w	9
71	Radwanice	9
72	Legnica	9
73	Bielawa	9
74	Dzier�oni�w	9
75	Pieszyce	9
76	Pi�awa G�rna	9
77	�agiewniki	9
78	Niemcza	9
79	Duszniki	9
80	K�odzko	9
81	Kudowa-Zdr�j	9
82	Nowa Ruda	9
83	Polanica-Zdr�j	9
84	Bystrzyca K�odzka	9
85	L�dek-Zdr�j	9
86	Lewin K�odzki	9
87	Mi�dzylesie	9
88	Radk�w	9
89	Stronie �l�skie	9
90	Szczytna	9
91	�widnica	9
92	�wiebodzice	9
93	Dobromierz	9
94	Jaworzyna �l�ska	9
95	Marcinowice	9
96	Strzegom	9
97	�ar�w	9
98	Bogusz�w-Gorce	9
99	Jedlina-Zdr�j	9
100	Szczawno	9
101	Czarny B�r	9
102	G�uszyca	9
103	Mierosz�w	9
104	Stare Bogaczowice	9
105	Walim	9
106	Wa�brzych	9
107	Bardo	9
108	Ciep�owody	9
109	Kamieniec Z�bkowicki	9
110	Stoszowice	9
111	Z�bkowice �l�skie	9
112	Zi�bice	9
113	Z�oty Stok	9
114	Cieszk�w	9
115	Kro�nice	9
116	Milicz	9
117	Ole�nica	9
118	Bierut�w	9
119	Dobroszyce	9
120	Dziadowa K�oda	9
121	Mi�dzyb�rz	9
122	Syc�w	9
123	Twardog�ra	9
124	O�awa	9
125	Domani�w	9
126	Jelcz-Laskowice	9
127	Bor�w	9
128	Kondratowice	9
129	Przeworno	9
130	Strzelin	9
131	Wi�z�w	9
132	Kostom�oty	9
133	Malczyce	9
134	Mi�kinia	9
135	�roda �l�ska	9
136	Udanin	9
137	Oborniki �l�skie	9
138	Prusice	9
139	Trzebnica	9
140	Wisznia Ma�a	9
141	Zawonia	9
142	�migr�d	9
143	Brzeg Dolny	9
144	Wi�sko	9
145	Wo��w	9
146	Czernica	9
147	D�ugo��ka	9
148	Jordan�w �l�ski	9
149	K�ty Wroc�awskie	9
150	Kobierzyce	9
151	Mietk�w	9
152	Sob�tka	9
153	�wi�ta Katarzyna	9
154	Siechnice	9
155	��rawina	9
156	Wroc�aw	9
157	Bia�e B�ota	2
158	D�browa Che�mi�ska	2
159	Dobrcz	2
160	Koronowo	2
161	Nowa Wie� Wielka	2
162	Osielsko	2
163	Sicienko	2
164	Solec Kujawski	2
165	Che�m�a	2
166	Czernikowo	2
167	Lubicz	2
168	�ubianka	2
169	�ysomice	2
170	Obrowo	2
171	Wielka Nieszawka	2
172	Z�awie� Wielka	2
173	Bydgoszcz	2
174	Toru�	2
175	Brodnica	2
176	Bobrowo	2
177	Brzozie	2
178	G�rzno	2
179	Bartniczka	2
180	Jab�onowo Pomorskie	2
181	Osiek	2
182	�wiedziebnia	2
183	Zbiczno	2
184	Che�mno	2
185	Kijewo Kr�lewskie	2
186	Lisewo	2
187	Papowo Biskupie	2
188	Stolno	2
189	Unis�aw	2
190	Golub-Dobrzy�	2
191	Ciechocin	2
192	Kowalewo Pomorskie	2
193	Radomin	2
194	Zb�jno	2
195	Grudzi�dz	2
196	Gruta	2
197	�asin	2
198	Radzy� Che�mi�ski	2
199	Rog�no	2
200	�wiecie nad Os�	2
201	Kamie� Kraje�ski	2
202	S�p�lno Kraje�skie	2
203	So�no	2
204	Wi�cbork	2
205	Bukowiec	2
206	Dragacz	2
207	Drzycim	2
208	Je�ewo	2
209	Lniano	2
210	Nowe	2
211	Osie	2
212	Pruszcz	2
213	�wiecie	2
214	�wiekatowo	2
215	Warlubie	2
216	Cekcyn	2
217	Gostycyn	2
218	K�sowo	2
219	Lubiewo	2
220	�liwice	2
221	Tuchola	2
222	W�brze�no	2
223	D�bowa ��ka	2
224	Ksi��ki	2
225	P�u�nica	2
226	Aleksandr�w Kujawski	2
227	Ciechocinek	2
228	Nieszawa	2
229	B�dkowo	2
230	Koneck	2
231	Raci��ek	2
232	Waganiec	2
233	Zakrzewo	2
234	Inowroc�aw	2
235	D�browa Biskupia	2
236	Gniewkowo	2
237	Janikowo	2
238	Kruszwica	2
239	Pako��	2
240	Rojewo	2
241	Z�otniki Kujawskie	2
242	Lipno	2
243	Bobrowniki	2
244	Chrostkowo	2
245	Dobrzy� nad Wis��	2
246	Kik�	2
247	Sk�pe	2
248	T�uchowo	2
249	Wielgie	2
250	D�browa	2
251	Jeziora Wielkie	2
252	Mogilno	2
253	Strzelno	2
254	Kcynia	2
255	Mrocza	2
256	Nak�o nad Noteci�	2
257	Sadki	2
258	Szubin	2
259	Radziej�w	2
260	Byto�	2
261	Dobre	2
262	Osi�ciny	2
263	Piotrk�w Kujawski	2
264	Top�lka	2
265	Rypin	2
266	Brzuze	2
267	Rogowo	2
268	Skrwilno	2
269	W�pielsk	2
270	Kowal	2
271	Baruchowo	2
272	Boniewo	2
273	Brze�� Kujawski	2
274	Choce�	2
275	Chodecz	2
276	Fabianki	2
277	Izbica Kujawska	2
278	Lubanie	2
279	Lubie� Kujawski	2
280	Lubraniec	2
281	W�oc�awek	2
282	Barcin	2
283	G�sawa	2
284	Janowiec Wielkopolski	2
285	�abiszyn	2
286	�nin	2
287	Mi�dzyrzec Podlaski	3
288	Terespol	3
289	Bia�a Podlaska	3
290	Drel�w	3
291	Jan�w Podlaski	3
292	Kode�	3
293	Konstantyn�w	3
294	Le�na Podlaska	3
295	�omazy	3
296	Piszczac	3
297	Rokitno	3
298	Rossosz	3
299	S�awatycze	3
300	Sosn�wka	3
301	Tuczna	3
302	Wisznice	3
303	Zalesie	3
304	D�bowa K�oda	3
305	Jab�o�	3
306	Milan�w	3
307	Parczew	3
308	Podedw�rze	3
309	Siemie�	3
310	Sosnowica	3
311	Radzy� Podlaski	3
312	Borki	3
313	Czemierniki	3
314	K�kolewnica Wschodnia	3
315	Komar�wka Podlaska	3
316	Ulan	3
317	Wohy�	3
318	W�odawa	3
319	Hanna	3
320	Ha�sk	3
321	Stary Brus	3
322	Urszulin	3
323	Wola Uhruska	3
324	Wyryki	3
325	Bi�goraj	3
326	Aleksandr�w	3
327	Biszcza	3
328	Frampol	3
329	Goraj	3
330	J�zef�w	3
331	Ksi�pol	3
332	�ukowa	3
333	Obsza	3
334	Potok G�rny	3
335	Tarnogr�d	3
336	Tereszpol	3
337	Turobin	3
338	Rejowiec Fabryczny	3
339	Bia�opole	3
340	Che�m	3
341	Dorohusk	3
342	Dubienka	3
343	Kamie�	3
344	Le�niowice	3
345	Ruda	3
346	Sawin	3
347	Siedliszcze	3
348	Wierzbica	3
349	Wojs�awice	3
350	�mud�	3
351	Rejowiec	3
352	Hrubiesz�w	3
353	Do�hobycz�w	3
354	Horod�o	3
355	Mircze	3
356	Trzeszczany	3
357	Uchanie	3
358	Werbkowice	3
359	Krasnystaw	3
360	Fajs�awice	3
361	Gorzk�w	3
362	Izbica	3
363	Kra�niczyn	3
364	�opiennik G�rny	3
365	Rudnik	3
366	Siennica R�ana	3
367	��kiewka	3
368	Tomasz�w Lubelski	3
369	Be��ec	3
370	Jarcz�w	3
371	Krynice	3
372	Lubycza Kr�lewska	3
373	�aszcz�w	3
374	Rachanie	3
375	Susiec	3
376	Tarnawatka	3
377	Telatyn	3
378	Tyszowce	3
379	Ulh�wek	3
380	Adam�w	3
381	Grabowiec	3
382	Komar�w	3
383	Krasnobr�d	3
384	�abunie	3
385	Mi�czyn	3
386	Nielisz	3
387	Radecznica	3
388	Sitno	3
389	Skierbiesz�w	3
390	Stary Zamo��	3
391	Su��w	3
392	Szczebrzeszyn	3
393	Zamo��	3
394	Zwierzyniec	3
395	Lubart�w	3
396	Abram�w	3
397	Firlej	3
398	Jeziorzany	3
399	Kamionka	3
400	Kock	3
401	Mich�w	3
402	Nied�wiada	3
403	Ostr�w Lubelski	3
404	Ostr�wek	3
405	Serniki	3
406	U�cim�w	3
407	Be��yce	3
408	Borzech�w	3
409	Bychawa	3
410	Garb�w	3
411	G�usk	3
412	Jab�onna	3
413	Jastk�w	3
414	Konopnica	3
415	Krzczon�w	3
416	Niedrzwica Du�a	3
417	Niemce	3
418	Strzy�ewice	3
419	Wojciech�w	3
420	W�lka	3
421	Wysokie	3
422	Zakrzew	3
423	Cyc�w	3
424	Ludwin	3
425	��czna	3
426	Milej�w	3
427	Puchacz�w	3
428	Spiczyn	3
429	�widnik	3
430	Me�giew	3
431	Piaski	3
432	Rybczewice	3
433	Trawniki	3
434	Lublin	3
435	Batorz	3
436	Chrzan�w	3
437	Dzwola	3
438	Godzisz�w	3
439	Jan�w Lubelski	3
440	Modliborzyce	3
441	Potok Wielki	3
442	Kra�nik	3
443	Annopol	3
444	Dzierzkowice	3
445	Go�cierad�w	3
446	Szastarka	3
447	Trzydnik Du�y	3
448	Urz�d�w	3
449	Wilko�az	3
450	Zakrz�wek	3
451	�uk�w	3
452	Stoczek �ukowski	3
453	Krzywda	3
454	Serokomla	3
455	Stanin	3
456	Trzebiesz�w	3
457	Wojcieszk�w	3
458	Wola Mys�owska	3
459	Chodel	3
460	J�zef�w nad Wis��	3
461	Karczmiska	3
462	�aziska	3
463	Opole Lubelskie	3
464	Poniatowa	3
465	Wilk�w	3
466	Pu�awy	3
467	Baran�w	3
468	Janowiec	3
469	Kazimierz Dolny	3
470	Ko�skowola	3
471	Kur�w	3
472	Markusz�w	3
473	Na��cz�w	3
474	W�wolnica	3
475	�yrzyn	3
476	D�blin	3
477	K�oczew	3
478	Nowodw�r	3
479	Ryki	3
480	St�yca	3
481	U��	3
482	Kostrzyn nad Odr�	4
483	Bogdaniec	4
484	Deszczno	4
485	K�odawa	4
486	Lubiszyn	4
487	Santok	4
488	Witnica	4
489	Bledzew	4
490	Mi�dzyrzecz	4
491	Przytoczna	4
492	Pszczew	4
493	Skwierzyna	4
494	Trzciel	4
495	Cybinka	4
496	G�rzyca	4
497	O�no Lubuskie	4
498	Rzepin	4
499	S�ubice	4
500	Dobiegniew	4
501	Drezdenko	4
502	Stare Kurowo	4
503	Strzelce Kraje�skie	4
504	Zwierzyn	4
505	Krzeszyce	4
506	Lubniewice	4
507	S�o�sk	4
508	Sul�cin	4
509	Torzym	4
510	Gorz�w Wielkopolski	4
511	Gubin	4
512	Bobrowice	4
513	Bytnica	4
514	D�bie	4
515	Krosno Odrza�skie	4
516	Maszewo	4
517	Nowa S�l	4
518	Bytom Odrza�ski	4
519	Kolsko	4
520	Ko�uch�w	4
521	Nowe Miasteczko	4
522	Oty�	4
523	Siedlisko	4
524	S�awa	4
525	Szlichtyngowa	4
526	Wschowa	4
527	Lubrza	4
528	�ag�w	4
529	Sk�pe	4
530	Szczaniec	4
531	�wiebodzin	4
532	Zb�szynek	4
533	Babimost	4
534	Bojad�a	4
535	Czerwie�sk	4
536	Kargowa	4
537	Nowogr�d Bobrza�ski	4
538	Sulech�w	4
539	�widnica	4
540	Trzebiech�w	4
541	Zab�r	4
542	Zielona G�ra	4
543	Gozdnica	4
544	�aga�	4
545	Brze�nica	4
546	I�owa	4
547	Ma�omice	4
548	Niegos�awice	4
549	Szprotawa	4
550	Wymiarki	4
551	��knica	4
552	�ary	4
553	Brody	4
554	Jasie�	4
555	Lipinki �u�yckie	4
556	Lubsko	4
557	Przew�z	4
558	Trzebiel	4
559	Tuplice	4
560	Brzeziny	5
561	Andrespol	5
562	Br�jce	5
563	Dmosin	5
564	Je��w	5
565	Koluszki	5
566	Nowosolna	5
567	Rog�w	5
568	Rzg�w	5
569	Tuszyn	5
570	Konstantyn�w ��dzki	5
571	Pabianice	5
572	D�ut�w	5
573	Dobro�	5
574	Ksawer�w	5
575	Lutomiersk	5
576	G�owno	5
577	Ozork�w	5
578	Zgierz	5
579	Aleksandr�w ��dzki	5
580	Parz�czew	5
581	Stryk�w	5
582	��d�	5
583	Be�chat�w	5
584	Dru�bice	5
585	Kleszcz�w	5
586	Kluki	5
587	Rusiec	5
588	Szczerc�w	5
589	Zel�w	5
590	Bia�acz�w	5
591	Drzewica	5
592	Mniszk�w	5
593	Opoczno	5
594	Parady�	5
595	Po�wi�tne	5
596	S�awno	5
597	�arn�w	5
598	Aleksandr�w	5
599	Czarnocin	5
600	Gorzkowice	5
601	Grabica	5
602	��ki Szlacheckie	5
603	Moszczenica	5
604	R�czno	5
605	Rozprza	5
606	Sulej�w	5
607	Wola Krzysztoporska	5
608	Wolb�rz	5
609	Radomsko	5
610	Dobryszyce	5
611	Gidle	5
612	Gomunice	5
613	Kamie�sk	5
614	Kobiele Wielkie	5
615	Kodr�b	5
616	Lgota Wielka	5
617	�adzice	5
618	Mas�owice	5
619	Przedb�rz	5
620	Wielgom�yny	5
621	�ytno	5
622	Tomasz�w Mazowiecki	5
623	B�dk�w	5
624	Budziszewice	5
625	Czerniewice	5
626	Inow��dz	5
627	Lubochnia	5
628	Rokiciny	5
629	Rzeczyca	5
630	Ujazd	5
631	�elechlinek	5
632	Piotrk�w Trybunalski	5
633	Buczek	5
634	�ask	5
635	S�dziejowice	5
636	Widawa	5
637	Wodzierady	5
638	Dzia�oszyn	5
639	Kie�czyg��w	5
640	Nowa Brze�nica	5
641	Paj�czno	5
642	Rz��nia	5
643	Siemkowice	5
644	Strzelce Wielkie	5
645	Sulmierzyce	5
646	Dalik�w	5
647	P�czniew	5
648	Podd�bice	5
649	Uniej�w	5
650	Wartkowice	5
651	Zadzim	5
652	Sieradz	5
653	B�aszki	5
654	Br�szewice	5
655	Brze�nio	5
656	Burzenin	5
657	Goszczan�w	5
658	Klonowa	5
659	Warta	5
660	Wr�blew	5
661	Z�oczew	5
662	Bia�a	5
663	Czarno�y�y	5
664	Konopnica	5
665	Mokrsko	5
666	Osjak�w	5
667	Ostr�wek	5
668	P�tn�w	5
669	Skomlin	5
670	Wielu�	5
671	Wierzchlas	5
672	Boles�awiec	5
673	Czastary	5
674	Galewice	5
675	Lutut�w	5
676	�ubnice	5
677	Sokolniki	5
678	Wierusz�w	5
679	Zdu�ska Wola	5
680	Szadek	5
681	Zapolice	5
682	Kutno	5
683	Bedlno	5
684	D�browice	5
685	Kro�niewice	5
686	Krzy�an�w	5
687	�ani�ta	5
688	Nowe Ostrowy	5
689	Opor�w	5
690	Strzelce	5
691	�ychlin	5
692	��czyca	5
693	Daszyna	5
694	G�ra �wi�tej Ma�gorzaty	5
695	Grab�w	5
696	Pi�tek	5
697	�winice Warckie	5
698	Witonia	5
699	�owicz	5
700	Bielawy	5
701	Ch��no	5
702	Domaniewice	5
703	Kiernozia	5
704	Kocierzew Po�udniowy	5
705	�yszkowice	5
706	Niebor�w	5
707	Zduny	5
708	Rawa Mazowiecka	5
709	Bia�a Rawska	5
710	Ciel�dz	5
711	Regn�w	5
712	Sadkowice	5
713	Bolim�w	5
714	G�uch�w	5
715	Godzian�w	5
716	Kowiesy	5
717	Lipce Reymontowskie	5
718	Mak�w	5
719	Nowy Kaw�czyn	5
720	Skierniewice	5
721	S�upia	5
722	Bochnia	6
723	Drwinia	6
724	Lipnica Murowana	6
725	�apan�w	6
726	Nowy Wi�nicz	6
727	Rzezawa	6
728	Trzciana	6
729	�egocina	6
730	Czernich�w	6
731	Igo�omia	6
732	Iwanowice	6
733	Jerzmanowice	6
734	Kocmyrz�w	6
735	Krzeszowice	6
736	Liszki	6
737	Micha�owice	6
738	Mogilany	6
739	Ska�a	6
740	Skawina	6
741	S�omniki	6
742	Su�oszowa	6
743	�wi�tniki G�rne	6
744	Wielka Wie�	6
745	Zabierz�w	6
746	Zielonki	6
747	Charsznica	6
748	Go�cza	6
749	Koz��w	6
750	Ksi�� Wielki	6
751	Miech�w	6
752	Rac�awice	6
753	S�abosz�w	6
754	Dobczyce	6
755	Lubie�	6
756	My�lenice	6
757	Pcim	6
758	Raciechowice	6
759	Siepraw	6
760	Su�kowice	6
761	Tokarnia	6
762	Wi�niowa	6
763	Koniusza	6
764	Koszyce	6
765	Nowe Brzesko	6
766	Pa�ecznica	6
767	Proszowice	6
768	Radziemice	6
769	Biskupice	6
770	Gd�w	6
771	K�aj	6
772	Niepo�omice	6
773	Wieliczka	6
774	Krak�w	6
775	Gorlice	6
776	Biecz	6
777	Bobowa	6
778	Lipinki	6
779	�u�na	6
780	Moszczenica	6
781	Ropa	6
782	S�kowa	6
783	U�cie Gorlickie	6
784	Limanowa	6
785	Mszana Dolna	6
786	Dobra	6
787	Jod�ownik	6
788	Kamienica	6
789	Laskowa	6
790	�ukowica	6
791	Nied�wied�	6
792	S�opnice	6
793	Tymbark	6
794	Gryb�w	6
795	Che�miec	6
796	Gr�dek nad Dunajcem	6
797	Kamionka Wielka	6
798	Korzenna	6
799	Krynica-Zdr�j	6
800	�abowa	6
801	��cko	6
802	�ososina Dolna	6
803	Muszyna	6
804	Nawojowa	6
805	Piwniczna-Zdr�j	6
806	Podegrodzie	6
807	Rytro	6
808	Stary S�cz	6
809	Nowy Targ	6
810	Szczawnica	6
811	Czarny Dunajec	6
812	Czorsztyn	6
813	Jab�onka	6
814	Kro�cienko nad Dunajcem	6
815	Lipnica Wielka	6
816	�apsze Ni�ne	6
817	Ochotnica Dolna	6
818	Raba Wy�na	6
819	Rabka-Zdr�j	6
820	Spytkowice	6
821	Szaflary	6
822	Zakopane	6
823	Bia�y Dunajec	6
824	Bukowina Tatrza�ska	6
825	Ko�cielisko	6
826	Poronin	6
827	Nowy S�cz	6
828	Alwernia	6
829	Babice	6
830	Chrzan�w	6
831	Libi��	6
832	Trzebinia	6
833	Bukowno	6
834	S�awk�w	6
835	Boles�aw	6
836	Klucze	6
837	Olkusz	6
838	Trzyci��	6
839	Wolbrom	6
840	O�wi�cim	6
841	Brzeszcze	6
842	Che�mek	6
843	K�ty	6
844	Osiek	6
845	Polanka Wielka	6
846	Przecisz�w	6
847	Zator	6
848	Jordan�w	6
849	Sucha Beskidzka	6
850	Budz�w	6
851	Bystra	6
852	Mak�w Podhala�ski	6
853	Stryszawa	6
854	Zawoja	6
855	Zembrzyce	6
856	Andrych�w	6
857	Brze�nica	6
858	Kalwaria Zebrzydowska	6
859	Lanckorona	6
860	Mucharz	6
861	Strysz�w	6
862	Tomice	6
863	Wadowice	6
864	Wieprz	6
865	Borz�cin	6
866	Brzesko	6
867	Czch�w	6
868	D�bno	6
869	Gnojnik	6
870	Iwkowa	6
871	Szczurowa	6
872	D�browa Tarnowska	6
873	Gr�bosz�w	6
874	M�drzech�w	6
875	Olesno	6
876	Radgoszcz	6
877	Szczucin	6
878	Ci�kowice	6
879	Gromnik	6
880	Lisia G�ra	6
881	Ple�na	6
882	Rad��w	6
883	Ryglice	6
884	Rzepiennik Strzy�ewski	6
885	Skrzysz�w	6
886	Tarn�w	6
887	Tuch�w	6
888	Wierzchos�awice	6
889	Wietrzychowice	6
890	Wojnicz	6
891	Zakliczyn	6
892	�abno	6
893	Szerzyny	6
894	Ciechan�w	7
895	Glinojeck	7
896	Go�ymin	7
897	Grudusk	7
898	Ojrze�	7
899	Opinog�ra G�rna	7
900	Regimin	7
901	So�sk	7
902	Gostynin	7
903	Pacyna	7
904	Sanniki	7
905	Szczawin Ko�cielny	7
906	M�awa	7
907	Dzierzgowo	7
908	Lipowiec Ko�cielny	7
909	Radzan�w	7
910	Strzegowo	7
911	Stupsk	7
912	Szre�sk	7
913	Szyd�owo	7
914	Wieczfnia Ko�cielna	7
915	Wi�niewo	7
916	Bielsk	7
917	Bodzan�w	7
918	Brudze� Du�y	7
919	Bulkowo	7
920	Drobin	7
921	G�bin	7
922	��ck	7
923	Ma�a Wie�	7
924	Nowy Dunin�w	7
925	Radzanowo	7
926	S�ubice	7
927	S�upno	7
928	Stara Bia�a	7
929	Staro�reby	7
930	Wyszogr�d	7
931	P�o�sk	7
932	Raci��	7
933	Baboszewo	7
934	Czerwi�sk nad Wis��	7
935	Dzierz��nia	7
936	Joniec	7
937	Naruszewo	7
938	Nowe Miasto	7
939	Sochocin	7
940	Za�uski	7
941	Sierpc	7
942	Gozdowo	7
943	Mochowo	7
944	Ro�ciszewo	7
945	Szczutowo	7
946	Zawidz	7
947	Bie�u�	7
948	Kuczbork	7
949	Lubowidz	7
950	Lutocin	7
951	Siemi�tkowo	7
952	�uromin	7
953	P�ock	7
954	Huszlew	7
955	�osice	7
956	Olszanka	7
957	Plater�w	7
958	Sarnaki	7
959	Stara Kornica	7
960	Mak�w Mazowiecki	7
961	Czerwonka	7
962	Karniewo	7
963	Krasnosielc	7
964	M�ynarze	7
965	P�oniawy	7
966	R�an	7
967	Rzewnie	7
968	Sypniewo	7
969	Szelk�w	7
970	Baranowo	7
971	Czarnia	7
972	Czerwin	7
973	Goworowo	7
974	Kadzid�o	7
975	Lelis	7
976	�yse	7
977	Myszyniec	7
978	Olszewo	7
979	Rzeku�	7
980	Troszyn	7
981	Ostr�w Mazowiecka	7
982	Andrzejewo	7
983	Boguty	7
984	Brok	7
985	Ma�kinia G�rna	7
986	Nur	7
987	Stary Luboty�	7
988	Szulborze Wielkie	7
989	W�sewo	7
990	Zar�by Ko�cielne	7
991	Przasnysz	7
992	Chorzele	7
993	Czernice Borowe	7
994	Jednoro�ec	7
995	Krasne	7
996	Krzynow�oga Ma�a	7
997	Gzy	7
998	Obryte	7
999	Pokrzywnica	7
1000	Pu�tusk	7
1001	�wiercze	7
1002	Winnica	7
1003	Zatory	7
1004	Domanice	7
1005	Korczew	7
1006	Kotu�	7
1007	Mokobody	7
1008	Mordy	7
1009	Paprotnia	7
1010	Przesmyki	7
1011	Siedlce	7
1012	Sk�rzec	7
1013	Sucho�ebry	7
1014	Wi�niew	7
1015	Wodynie	7
1016	Zbuczyn	7
1017	Soko��w Podlaski	7
1018	Bielany	7
1019	Ceran�w	7
1020	Jab�onna Lacka	7
1021	Kos�w Lacki	7
1022	Repki	7
1023	Sabnie	7
1024	Sterdy�	7
1025	W�gr�w	7
1026	Gr�bk�w	7
1027	Korytnica	7
1028	Liw	7
1029	�och�w	7
1030	Miedzna	7
1031	Sadowne	7
1032	Stoczek	7
1033	Wierzbno	7
1034	Bra�szczyk	7
1035	D�ugosiod�o	7
1036	Rz��nik	7
1037	Somianka	7
1038	Wyszk�w	7
1039	Zabrodzie	7
1040	Ostro��ka	7
1041	Bia�obrzegi	7
1042	Promna	7
1043	Stara B�otnica	7
1044	Stromiec	7
1045	Wy�mierzyce	7
1046	Garbatka	7
1047	G�owacz�w	7
1048	Gniewosz�w	7
1049	Grab�w nad Pilic�	7
1050	Kozienice	7
1051	Magnuszew	7
1052	Sieciech�w	7
1053	Chotcza	7
1054	Ciepiel�w	7
1055	Lipsko	7
1056	Rzeczni�w	7
1057	Sienno	7
1058	Solec nad Wis��	7
1059	Borkowice	7
1060	Gielni�w	7
1061	Klw�w	7
1062	Odrzyw�	7
1063	Potwor�w	7
1064	Przysucha	7
1065	Rusin�w	7
1066	Wieniawa	7
1067	Pionki	7
1068	G�zd	7
1069	I��a	7
1070	Jastrz�bia	7
1071	Jedli�sk	7
1072	Jedlnia	7
1073	Kowala	7
1074	Przytyk	7
1075	Skaryszew	7
1076	Wierzbica	7
1077	Wolan�w	7
1078	Zakrzew	7
1079	Chlewiska	7
1080	Jastrz�b	7
1081	Mir�w	7
1082	Oro�sko	7
1083	Szyd�owiec	7
1084	Kazan�w	7
1085	Policzna	7
1086	Przy��k	7
1087	Tcz�w	7
1088	Zwole�	7
1089	Radom	7
1090	Warszawa	7
1091	Bemowo	7
1092	Bia�o��ka	7
1093	Mokot�w	7
1094	Ochota	7
1095	Praga	7
1096	Rembert�w	7
1097	�r�dmie�cie	7
1098	Targ�wek	7
1099	Ursus	7
1100	Ursyn�w	7
1101	Wawer	7
1102	Weso�a	7
1103	Wilan�w	7
1104	W�ochy	7
1105	Wola	7
1106	�oliborz	7
1107	Garwolin	7
1108	�askarzew	7
1109	Borowie	7
1110	G�rzno	7
1111	Maciejowice	7
1112	Miastk�w Ko�cielny	7
1113	Parys�w	7
1114	Pilawa	7
1115	Sobolew	7
1116	Trojan�w	7
1117	Wilga	7
1118	�elech�w	7
1119	Legionowo	7
1120	Jab�onna	7
1121	Niepor�t	7
1122	Serock	7
1123	Wieliszew	7
1124	Mi�sk Mazowiecki	7
1125	Sulej�wek	7
1126	Ceg��w	7
1127	D�be Wielkie	7
1128	Dobre	7
1129	Halin�w	7
1130	Jakub�w	7
1131	Ka�uszyn	7
1132	Latowicz	7
1133	Mrozy	7
1134	Siennica	7
1135	Stanis�aw�w	7
1136	Nowy Dw�r Mazowiecki	7
1137	Czosn�w	7
1138	Leoncin	7
1139	Nasielsk	7
1140	Pomiech�wek	7
1141	Zakroczym	7
1142	J�zef�w	7
1143	Otwock	7
1144	Celestyn�w	7
1145	Karczew	7
1146	Ko�biel	7
1147	Osieck	7
1148	Sobienie	7
1149	Wi�zowna	7
1150	Koby�ka	7
1151	Marki	7
1152	Z�bki	7
1153	Zielonka	7
1154	D�br�wka	7
1155	Jad�w	7
1156	Klemb�w	7
1157	Po�wi�tne	7
1158	Radzymin	7
1159	Strach�wka	7
1160	T�uszcz	7
1161	Wo�omin	7
1162	Milan�wek	7
1163	Podkowa Le�na	7
1164	Baran�w	7
1165	Grodzisk Mazowiecki	7
1166	Jaktor�w	7
1167	�abia Wola	7
1168	Belsk Du�y	7
1169	B��d�w	7
1170	Chyn�w	7
1171	Goszczyn	7
1172	Gr�jec	7
1173	Jasieniec	7
1174	Mogielnica	7
1175	Nowe Miasto nad Pilic�	7
1176	Pniewy	7
1177	Tarczyn	7
1178	Warka	7
1179	G�ra Kalwaria	7
1180	Konstancin-Jeziorna	7
1181	Lesznowola	7
1182	Piaseczno	7
1183	Pra�m�w	7
1184	Piast�w	7
1185	Pruszk�w	7
1186	Brwin�w	7
1187	Micha�owice	7
1188	Nadarzyn	7
1189	Raszyn	7
1190	Sochaczew	7
1191	Broch�w	7
1192	I��w	7
1193	M�odzieszyn	7
1194	Nowa Sucha	7
1195	Rybno	7
1196	Teresin	7
1197	B�onie	7
1198	Izabelin	7
1199	Kampinos	7
1200	Leszno	7
1201	�omianki	7
1202	O�ar�w Mazowiecki	7
1203	Stare Babice	7
1204	�yrard�w	7
1205	Mszczon�w	7
1206	Puszcza Maria�ska	7
1207	Radziejowice	7
1208	Wiskitki	7
1209	Brzeg	8
1210	Skarbimierz	8
1211	Grodk�w	8
1212	Lewin Brzeski	8
1213	Lubsza	8
1214	Olszanka	8
1215	Byczyna	8
1216	Kluczbork	8
1217	Lasowice Wielkie	8
1218	Wo�czyn	8
1219	Domaszowice	8
1220	Namys��w	8
1221	Pok�j	8
1222	�wiercz�w	8
1223	Wilk�w	8
1224	G�ucho�azy	8
1225	Kamiennik	8
1226	Korfant�w	8
1227	�ambinowice	8
1228	Nysa	8
1229	Otmuch�w	8
1230	Paczk�w	8
1231	Pakos�awice	8
1232	Skoroszyce	8
1233	Bia�a	8
1234	G�og�wek	8
1235	Lubrza	8
1236	Prudnik	8
1237	Babor�w	8
1238	Branice	8
1239	G�ubczyce	8
1240	Kietrz	8
1241	K�dzierzyn-Ko�le	8
1242	Bierawa	8
1243	Cisek	8
1244	Paw�owiczki	8
1245	Polska Cerekiew	8
1246	Re�ska Wie�	8
1247	Gogolin	8
1248	Krapkowice	8
1249	Strzeleczki	8
1250	Walce	8
1251	Zdzieszowice	8
1252	Dobrodzie�	8
1253	Gorz�w �l�ski	8
1254	Olesno	8
1255	Praszka	8
1256	Rad��w	8
1257	Rudniki	8
1258	Z�bowice	8
1259	Chrz�stowice	8
1260	D�browa	8
1261	Dobrze� Wielki	8
1262	Komprachcice	8
1263	�ubniany	8
1264	Mur�w	8
1265	Niemodlin	8
1266	Ozimek	8
1267	Popiel�w	8
1268	Pr�szk�w	8
1269	Tarn�w Opolski	8
1270	Tu�owice	8
1271	Turawa	8
1272	Izbicko	8
1273	Jemielnica	8
1274	Kolonowskie	8
1275	Le�nica	8
1276	Strzelce Opolskie	8
1277	Ujazd	8
1278	Zawadzkie	8
1279	Opole	8
1280	Baligr�d	1
1281	Cisna	1
1282	Czarna	1
1283	Lesko	1
1284	Lutowiska	1
1285	Olszanica	1
1286	Solina	1
1287	Ustrzyki Dolne	1
1288	Brzoz�w	1
1289	Domaradz	1
1290	Dydnia	1
1291	Hacz�w	1
1292	Jasienica Rosielna	1
1293	Nozdrzec	1
1294	Jas�o	1
1295	Brzyska	1
1296	D�bowiec	1
1297	Ko�aczyce	1
1298	Krempna	1
1299	Nowy �migr�d	1
1300	Osiek Jasielski	1
1301	Sko�yszyn	1
1302	Szerzyny	1
1303	Tarnowiec	1
1304	Chork�wka	1
1305	Dukla	1
1306	Iwonicz-Zdr�j	1
1307	Jedlicze	1
1308	Korczyna	1
1309	Kro�cienko Wy�ne	1
1310	Miejsce Piastowe	1
1311	Ryman�w	1
1312	Wojasz�wka	1
1313	Sanok	1
1314	Besko	1
1315	Bukowsko	1
1316	Koma�cza	1
1317	Tyrawa Wo�oska	1
1318	Zag�rz	1
1319	Zarszyn	1
1320	Krosno	1
1321	Jaros�aw	1
1322	Radymno	1
1323	Ch�opice	1
1324	Laszki	1
1325	Paw�osi�w	1
1326	Pruchnik	1
1327	Rokietnica	1
1328	Ro�wienica	1
1329	Wi�zownica	1
1330	Lubacz�w	1
1331	Cieszan�w	1
1332	Horyniec	1
1333	Narol	1
1334	Oleszyce	1
1335	Stary Dzik�w	1
1336	Wielkie Oczy	1
1337	Bircza	1
1338	Dubiecko	1
1339	Fredropol	1
1340	Krasiczyn	1
1341	Krzywcza	1
1342	Medyka	1
1343	Or�y	1
1344	Przemy�l	1
1345	Stubno	1
1346	�urawica	1
1347	Przeworsk	1
1348	Adam�wka	1
1349	Ga�	1
1350	Jawornik Polski	1
1351	Ka�czuga	1
1352	Sieniawa	1
1353	Try�cza	1
1354	Zarzecze	1
1355	Cmolas	1
1356	Kolbuszowa	1
1357	Majdan Kr�lewski	1
1358	Niwiska	1
1359	Rani��w	1
1360	Dzikowiec	1
1361	�a�cut	1
1362	Bia�obrzegi	1
1363	Markowa	1
1364	Rakszawa	1
1365	�o�ynia	1
1366	Iwierzyce	1
1367	Ostr�w	1
1368	Ropczyce	1
1369	S�dzisz�w Ma�opolski	1
1370	Wielopole Skrzy�skie	1
1371	Dyn�w	1
1372	B�a�owa	1
1373	Boguchwa�a	1
1374	Chmielnik	1
1375	G�og�w Ma�opolski	1
1376	Hy�ne	1
1377	Kamie�	1
1378	Krasne	1
1379	Lubenia	1
1380	Soko��w Ma�opolski	1
1381	�wilcza	1
1382	Trzebownisko	1
1383	Tyczyn	1
1384	Czudec	1
1385	Frysztak	1
1386	Niebylec	1
1387	Gromadka	1
1388	Wi�niowa	1
1389	Boles�awiec	1
1390	D�bica	1
1391	Brzostek	1
1392	Jod�owa	1
1393	Pilzno	1
1394	�yrak�w	1
1395	Le�ajsk	1
1396	Grodzisko Dolne	1
1397	Kury��wka	1
1398	Nowa Sarzyna	1
1399	Mielec	1
1400	Borowa	1
1401	Czermin	1
1402	Gaw�uszowice	1
1403	Padew Narodowa	1
1404	Przec�aw	1
1405	Radomy�l Wielki	1
1406	Tusz�w Narodowy	1
1407	Wadowice G�rne	1
1408	Harasiuki	1
1409	Jarocin	1
1410	Je�owe	1
1411	Krzesz�w	1
1412	Nisko	1
1413	Rudnik nad Sanem	1
1414	Ulan�w	1
1415	Stalowa Wola	1
1416	Bojan�w	1
1417	Pysznica	1
1418	Radomy�l nad Sanem	1
1419	Zaklik�w	1
1420	Zaleszany	1
1421	Baran�w Sandomierski	1
1422	Gorzyce	1
1423	Gr�b�w	1
1424	Nowa D�ba	1
1425	Tarnobrzeg	1
1426	Choroszcz	10
1427	Czarna Bia�ostocka	10
1428	Dobrzyniewo Du�e	10
1429	Gr�dek	10
1430	Juchnowiec Ko�cielny	10
1431	�apy	10
1432	Micha�owo	10
1433	Po�wi�tne	10
1434	Supra�l	10
1435	Sura�	10
1436	Turo�� Ko�cielna	10
1437	Tykocin	10
1438	Wasilk�w	10
1439	Zab�ud�w	10
1440	Zawady	10
1441	D�browa Bia�ostocka	10
1442	Jan�w	10
1443	Korycin	10
1444	Krynki	10
1445	Ku�nica	10
1446	Nowy Dw�r	10
1447	Sidra	10
1448	Sok�ka	10
1449	Suchowola	10
1450	Szudzia�owo	10
1451	Bia�ystok	10
1452	Bielsk Podlaski	10
1453	Bra�sk	10
1454	Bo�ki	10
1455	Orla	10
1456	Rudka	10
1457	Wyszki	10
1458	Hajn�wka	10
1459	Bia�owie�a	10
1460	Czeremcha	10
1461	Czy�e	10
1462	Dubicze Cerkiewne	10
1463	Kleszczele	10
1464	Narew	10
1465	Narewka	10
1466	Kolno	10
1467	Grabowo	10
1468	Ma�y P�ock	10
1469	Stawiski	10
1470	Turo�l	10
1471	Jedwabne	10
1472	�om�a	10
1473	Miastkowo	10
1474	Nowogr�d	10
1475	Pi�tnica	10
1476	Przytu�y	10
1477	�niadowo	10
1478	Wizna	10
1479	Zb�jna	10
1480	Siemiatycze	10
1481	Drohiczyn	10
1482	Dziadkowice	10
1483	Grodzisk	10
1484	Mielnik	10
1485	Milejczyce	10
1486	Nurzec	10
1487	Perlejewo	10
1488	Wysokie Mazowieckie	10
1489	Ciechanowiec	10
1490	Czy�ew	10
1491	Klukowo	10
1492	Kobylin	10
1493	Kulesze Ko�cielne	10
1494	Nowe Piekuty	10
1495	Soko�y	10
1496	Szepietowo	10
1497	Zambr�w	10
1498	Ko�aki Ko�cielne	10
1499	Rutki	10
1500	Szumowo	10
1501	August�w	10
1502	Barg��w Ko�cielny	10
1503	Lipsk	10
1504	Nowinka	10
1505	P�aska	10
1506	Sztabin	10
1507	Grajewo	10
1508	Radzi��w	10
1509	Rajgr�d	10
1510	Szczuczyn	10
1511	W�sosz	10
1512	Goni�dz	10
1513	Jasion�wka	10
1514	Ja�wi�y	10
1515	Knyszyn	10
1516	Krypno	10
1517	Mo�ki	10
1518	Trzcianne	10
1519	Sejny	10
1520	Giby	10
1521	Krasnopol	10
1522	Pu�sk	10
1523	Baka�arzewo	10
1524	Filip�w	10
1525	Jeleniewo	10
1526	Przero�l	10
1527	Raczki	10
1528	Rutka	10
1529	Suwa�ki	10
1530	Szypliszki	10
1531	Wi�ajny	10
1532	Pruszcz Gda�ski	11
1533	Cedry Wielkie	11
1534	Kolbudy	11
1535	Przywidz	11
1536	Pszcz�ki	11
1537	Suchy D�b	11
1538	Tr�bki Wielkie	11
1539	Chmielno	11
1540	Kartuzy	11
1541	Przodkowo	11
1542	Sierakowice	11
1543	Somonino	11
1544	St�yca	11
1545	Sul�czyno	11
1546	�ukowo	11
1547	Krynica Morska	11
1548	Nowy Dw�r Gda�ski	11
1549	Ostaszewo	11
1550	Stegna	11
1551	Sztutowo	11
1552	Hel	11
1553	Jastarnia	11
1554	Puck	11
1555	W�adys�awowo	11
1556	Kosakowo	11
1557	Krokowa	11
1558	Reda	11
1559	Rumia	11
1560	Wejherowo	11
1561	Choczewo	11
1562	Gniewino	11
1563	Linia	11
1564	Luzino	11
1565	��czyce	11
1566	Szemud	11
1567	Borzytuchom	11
1568	Byt�w	11
1569	Czarna D�br�wka	11
1570	Ko�czyg�owy	11
1571	Lipnica	11
1572	Miastko	11
1573	Parchowo	11
1574	Studzienice	11
1575	Trzebielino	11
1576	Tuchomie	11
1577	Chojnice	11
1578	Brusy	11
1579	Czersk	11
1580	Konarzyny	11
1581	Cz�uch�w	11
1582	Czarne	11
1583	Debrzno	11
1584	Kocza�a	11
1585	Przechlewo	11
1586	Rzeczenica	11
1587	L�bork	11
1588	�eba	11
1589	Cewice	11
1590	Nowa Wie� L�borska	11
1591	Wicko	11
1592	Ustka	11
1593	Damnica	11
1594	D�bnica Kaszubska	11
1595	G��wczyce	11
1596	K�pice	11
1597	Kobylnica	11
1598	Pot�gowo	11
1599	S�upsk	11
1600	Smo�dzino	11
1601	Ko�cierzyna	11
1602	Dziemiany	11
1603	Karsin	11
1604	Liniewo	11
1605	Lipusz	11
1606	Nowa Karczma	11
1607	Stara Kiszewa	11
1608	Kwidzyn	11
1609	Gardeja	11
1610	Prabuty	11
1611	Ryjewo	11
1612	Sadlinki	11
1613	Malbork	11
1614	Dzierzgo�	11
1615	Lichnowy	11
1616	Miko�ajki Pomorskie	11
1617	Mi�oradz	11
1618	Nowy Staw	11
1619	Stare Pole	11
1620	Stary Dzierzgo�	11
1621	Stary Targ	11
1622	Sztum	11
1623	Czarna Woda	11
1624	Sk�rcz	11
1625	Starogard Gda�ski	11
1626	Bobowo	11
1627	Kaliska	11
1628	Lubichowo	11
1629	Osieczna	11
1630	Osiek	11
1631	Skarszewy	11
1632	Sm�towo Graniczne	11
1633	Zblewo	11
1634	Tczew	11
1635	Gniew	11
1636	Morzeszczyn	11
1637	Pelplin	11
1638	Subkowy	11
1639	Gda�sk	11
1640	Gdynia	11
1641	Sopot	11
1642	Szczyrk	12
1643	Bestwina	12
1644	Buczkowice	12
1645	Czechowice-Dziedzice	12
1646	Jasienica	12
1647	Jaworze	12
1648	Kozy	12
1649	Por�bka	12
1650	Wilamowice	12
1651	Wilkowice	12
1652	Cieszyn	12
1653	Ustro�	12
1654	Wis�a	12
1655	Brenna	12
1656	Chybie	12
1657	D�bowiec	12
1658	Golesz�w	12
1659	Ha�lach	12
1660	Istebna	12
1661	Skocz�w	12
1662	Strumie�	12
1663	Zebrzydowice	12
1664	�ywiec	12
1665	Czernich�w	12
1666	Gilowice	12
1667	Jele�nia	12
1668	Koszarawa	12
1669	Lipowa	12
1670	��kawica	12
1671	�odygowice	12
1672	Mil�wka	12
1673	Radziechowy	12
1674	Rajcza	12
1675	�lemie�	12
1676	�winna	12
1677	Ujso�y	12
1678	W�gierska G�rka	12
1679	Bielsko-Bia�a	12
1680	Lubliniec	12
1681	Boron�w	12
1682	Ciasna	12
1683	Herby	12
1684	Kochanowice	12
1685	Kosz�cin	12
1686	Pawonk�w	12
1687	Wo�niki	12
1688	Kalety	12
1689	Miasteczko �l�skie	12
1690	Radzionk�w	12
1691	Tarnowskie G�ry	12
1692	Krupski M�yn	12
1693	O�arowice	12
1694	�wierklaniec	12
1695	Twor�g	12
1696	Zbros�awice	12
1697	Bytom	12
1698	Piekary �l�skie	12
1699	Blachownia	12
1700	D�browa Zielona	12
1701	Jan�w	12
1702	Kamienica Polska	12
1703	K�omnice	12
1704	Koniecpol	12
1705	Konopiska	12
1706	Kruszyna	12
1707	Lel�w	12
1708	Mst�w	12
1709	Mykan�w	12
1710	Olsztyn	12
1711	Poczesna	12
1712	Przyr�w	12
1713	R�dziny	12
1714	Starcza	12
1715	K�obuck	12
1716	Krzepice	12
1717	Lipie	12
1718	Mied�no	12
1719	Opat�w	12
1720	Panki	12
1721	Pop�w	12
1722	Przystaj�	12
1723	Wr�czyca Wielka	12
1724	Myszk�w	12
1725	Kozieg�owy	12
1726	Niegowa	12
1727	Poraj	12
1728	�arki	12
1729	Cz�stochowa	12
1730	Knur�w	12
1731	Pyskowice	12
1732	Giera�towice	12
1733	Pilchowice	12
1734	Rudziniec	12
1735	So�nicowice	12
1736	Toszek	12
1737	Wielowie�	12
1738	Gliwice	12
1739	Zabrze	12
1740	Chorz�w	12
1741	Katowice	12
1742	Mys�owice	12
1743	Ruda �l�ska	12
1744	Siemianowice �l�skie	12
1745	�wi�toch�owice	12
1746	Racib�rz	12
1747	Kornowac	12
1748	Krzanowice	12
1749	Krzy�anowice	12
1750	Ku�nia Raciborska	12
1751	N�dza	12
1752	Pietrowice Wielkie	12
1753	Rudnik	12
1754	Czerwionka-Leszczyny	12
1755	Gaszowice	12
1756	Jejkowice	12
1757	Lyski	12
1758	�wierklany	12
1759	Psz�w	12
1760	Radlin	12
1761	Rydu�towy	12
1762	Wodzis�aw �l�ski	12
1763	God�w	12
1764	Gorzyce	12
1765	Lubomia	12
1766	Marklowice	12
1767	Mszana	12
1768	Jastrz�bie-Zdr�j	12
1769	Rybnik	12
1770	�ory	12
1771	B�dzin	12
1772	Czelad�	12
1773	Wojkowice	12
1774	Bobrowniki	12
1775	Mierz�cice	12
1776	Psary	12
1777	Siewierz	12
1778	S�awk�w	12
1779	Por�ba	12
1780	Zawiercie	12
1781	Irz�dze	12
1782	Kroczyce	12
1783	�azy	12
1784	Ogrodzieniec	12
1785	Pilica	12
1786	Szczekociny	12
1787	W�odowice	12
1788	�arnowiec	12
1789	D�browa G�rnicza	12
1790	Jaworzno	12
1791	Sosnowiec	12
1792	�aziska G�rne	12
1793	Miko��w	12
1794	Orzesze	12
1795	Ornontowice	12
1796	Wyry	12
1797	Gocza�kowice	12
1798	Kobi�r	12
1799	Mied�na	12
1800	Paw�owice	12
1801	Pszczyna	12
1802	Suszec	12
1803	Bieru�	12
1804	Imielin	12
1805	L�dziny	12
1806	Bojszowy	12
1807	Che�m �l�ski	12
1808	Tychy	12
1809	Bieliny	13
1810	Bodzentyn	13
1811	Ch�ciny	13
1812	Chmielnik	13
1813	Daleszyce	13
1814	G�rno	13
1815	�ag�w	13
1816	�opuszno	13
1817	Mas��w	13
1818	Miedziana G�ra	13
1819	Mni�w	13
1820	Morawica	13
1821	Nowa S�upia	13
1822	Piekosz�w	13
1823	Pierzchnica	13
1824	Rak�w	13
1825	Sitk�wka	13
1826	Strawczyn	13
1827	Zagna�sk	13
1828	Fa�k�w	13
1829	Gowarcz�w	13
1830	Ko�skie	13
1831	Radoszyce	13
1832	Ruda Maleniecka	13
1833	S�upia	13
1834	Smyk�w	13
1835	St�pork�w	13
1836	Ostrowiec �wi�tokrzyski	13
1837	Ba�t�w	13
1838	Bodzech�w	13
1839	�miel�w	13
1840	Kun�w	13
1841	Wa�ni�w	13
1842	Skar�ysko-Kamienna	13
1843	Bli�yn	13
1844	��czna	13
1845	Skar�ysko Ko�cielne	13
1846	Suchedni�w	13
1847	Starachowice	13
1848	Brody	13
1849	Mirzec	13
1850	Paw��w	13
1851	W�chock	13
1852	Kielce	13
1853	Busko-Zdr�j	13
1854	Gnojno	13
1855	Nowy Korczyn	13
1856	Pacan�w	13
1857	Solec	13
1858	Stopnica	13
1859	Tucz�py	13
1860	Wi�lica	13
1861	Imielno	13
1862	J�drzej�w	13
1863	Ma�ogoszcz	13
1864	Nag�owice	13
1865	Oksa	13
1866	S�dzisz�w	13
1867	Sobk�w	13
1868	Wodzis�aw	13
1869	Bejsce	13
1870	Czarnocin	13
1871	Kazimierza Wielka	13
1872	Opatowiec	13
1873	Skalbmierz	13
1874	Ba�kowice	13
1875	Iwaniska	13
1876	Lipnik	13
1877	Opat�w	13
1878	O�ar�w	13
1879	Sadowie	13
1880	Tar��w	13
1881	Wojciechowice	13
1882	Dzia�oszyce	13
1883	Kije	13
1884	Micha��w	13
1885	Pi�cz�w	13
1886	Z�ota	13
1887	Sandomierz	13
1888	Dwikozy	13
1889	Klimont�w	13
1890	Koprzywnica	13
1891	�oni�w	13
1892	Obraz�w	13
1893	Samborzec	13
1894	Wilczyce	13
1895	Zawichost	13
1896	Bogoria	13
1897	�ubnice	13
1898	Ole�nica	13
1899	Osiek	13
1900	Po�aniec	13
1901	Rytwiany	13
1902	Stasz�w	13
1903	Szyd��w	13
1904	Kluczewsko	13
1905	Krasocin	13
1906	Moskorzew	13
1907	Radk�w	13
1908	Secemin	13
1909	W�oszczowa	13
1910	Braniewo	14
1911	Frombork	14
1912	Lelkowo	14
1913	Pieni�no	14
1914	P�oskinia	14
1915	Wilcz�ta	14
1916	Dzia�dowo	14
1917	I�owo	14
1918	Lidzbark	14
1919	P�o�nica	14
1920	Rybno	14
1921	Elbl�g	14
1922	Godkowo	14
1923	Gronowo Elbl�skie	14
1924	Markusy	14
1925	Milejewo	14
1926	M�ynary	14
1927	Pas��k	14
1928	Rychliki	14
1929	Tolkmicko	14
1930	I�awa	14
1931	Lubawa	14
1932	Kisielice	14
1933	Susz	14
1934	Zalewo	14
1935	Nowe Miasto Lubawskie	14
1936	Biskupiec	14
1937	Grodziczno	14
1938	Kurz�tnik	14
1939	Ostr�da	14
1940	D�br�wno	14
1941	Grunwald	14
1942	�ukta	14
1943	Ma�dyty	14
1944	Mi�akowo	14
1945	Mi�om�yn	14
1946	Mor�g	14
1947	E�k	14
1948	Kalinowo	14
1949	Prostki	14
1950	Stare Juchy	14
1951	Gi�ycko	14
1952	Banie Mazurskie	14
1953	Budry	14
1954	Kruklanki	14
1955	Mi�ki	14
1956	Pozezdrze	14
1957	Ryn	14
1958	W�gorzewo	14
1959	Wydminy	14
1960	Dubeninki	14
1961	Go�dap	14
1962	Kowale Oleckie	14
1963	Olecko	14
1964	�wi�tajno	14
1965	Wieliczki	14
1966	Bia�a Piska	14
1967	Orzysz	14
1968	Pisz	14
1969	Ruciane-Nida	14
1970	Bartoszyce	14
1971	G�rowo I�aweckie	14
1972	Bisztynek	14
1973	S�popol	14
1974	K�trzyn	14
1975	Barciany	14
1976	Korsze	14
1977	Reszel	14
1978	Srokowo	14
1979	Lidzbark Warmi�ski	14
1980	Kiwity	14
1981	Lubomino	14
1982	Orneta	14
1983	Mr�gowo	14
1984	Miko�ajki	14
1985	Piecki	14
1986	Sorkwity	14
1987	Janowiec Ko�cielny	14
1988	Janowo	14
1989	Koz�owo	14
1990	Nidzica	14
1991	Barczewo	14
1992	Dobre Miasto	14
1993	Dywity	14
1994	Gietrzwa�d	14
1995	Jeziorany	14
1996	Jonkowo	14
1997	Kolno	14
1998	Olsztynek	14
1999	Purda	14
2000	Stawiguda	14
2001	�wi�tki	14
2002	Szczytno	14
2003	D�wierzuty	14
2004	Jedwabno	14
2005	Pasym	14
2006	Rozogi	14
2007	Wielbark	14
2008	Olsztyn	14
2009	Jaraczewo	15
2010	Jarocin	15
2011	Kotlin	15
2012	�erk�w	15
2013	Blizan�w	15
2014	Brzeziny	15
2015	Cek�w	15
2016	Godziesze Wielkie	15
2017	Ko�minek	15
2018	Lisk�w	15
2019	Mycielin	15
2020	Opat�wek	15
2021	Stawiszyn	15
2022	Szczytniki	15
2023	�elazk�w	15
2024	Baran�w	15
2025	Bralin	15
2026	K�pno	15
2027	��ka Opatowska	15
2028	Perz�w	15
2029	Rychtal	15
2030	Trzcinica	15
2031	Sulmierzyce	15
2032	Kobylin	15
2033	Ko�min Wielkopolski	15
2034	Krotoszyn	15
2035	Rozdra�ew	15
2036	Zduny	15
2037	Ostr�w Wielkopolski	15
2038	Nowe Skalmierzyce	15
2039	Odolan�w	15
2040	Przygodzice	15
2041	Raszk�w	15
2042	Sieroszewice	15
2043	So�nie	15
2044	Czajk�w	15
2045	Doruch�w	15
2046	Grab�w nad Prosn�	15
2047	Kobyla G�ra	15
2048	Kraszewice	15
2049	Mikstat	15
2050	Ostrzesz�w	15
2051	Chocz	15
2052	Czermin	15
2053	Dobrzyca	15
2054	Giza�ki	15
2055	Go�uch�w	15
2056	Pleszew	15
2057	Kalisz	15
2058	Gniezno	15
2059	Czerniejewo	15
2060	Kiszkowo	15
2061	K�ecko	15
2062	�ubowo	15
2063	Mieleszyn	15
2064	Niechanowo	15
2065	Trzemeszno	15
2066	Witkowo	15
2067	Ko�o	15
2068	Babiak	15
2069	Chod�w	15
2070	D�bie	15
2071	Grzegorzew	15
2072	K�odawa	15
2073	Ko�cielec	15
2074	Olsz�wka	15
2075	Osiek Ma�y	15
2076	Przedecz	15
2077	Golina	15
2078	Grodziec	15
2079	Kazimierz Biskupi	15
2080	Kleczew	15
2081	Kramsk	15
2082	Krzym�w	15
2083	Rychwa�	15
2084	Rzg�w	15
2085	Skulsk	15
2086	Sompolno	15
2087	Stare Miasto	15
2088	�lesin	15
2089	Wierzbinek	15
2090	Wilczyn	15
2091	S�upca	15
2092	L�dek	15
2093	Orchowo	15
2094	Ostrowite	15
2095	Powidz	15
2096	Strza�kowo	15
2097	Zag�r�w	15
2098	Turek	15
2099	Brudzew	15
2100	Dobra	15
2101	Kaw�czyn	15
2102	Malan�w	15
2103	Przykona	15
2104	Tuliszk�w	15
2105	W�adys�aw�w	15
2106	Ko�aczkowo	15
2107	Mi�os�aw	15
2108	Nekla	15
2109	Pyzdry	15
2110	Wrze�nia	15
2111	Konin	15
2112	Borek Wielkopolski	15
2113	Gosty�	15
2114	Krobia	15
2115	P�powo	15
2116	Piaski	15
2117	Pogorzela	15
2118	Poniec	15
2119	Granowo	15
2120	Grodzisk Wielkopolski	15
2121	Kamieniec	15
2122	Rakoniewice	15
2123	Wielichowo	15
2124	Ko�cian	15
2125	Czempi�	15
2126	Krzywi�	15
2127	�migiel	15
2128	Krzemieniewo	15
2129	Lipno	15
2130	Osieczna	15
2131	Rydzyna	15
2132	�wi�ciechowa	15
2133	Wijewo	15
2134	W�oszakowice	15
2135	Chrzypsko Wielkie	15
2136	Kwilcz	15
2137	Mi�dzych�d	15
2138	Sierak�w	15
2139	Ku�lin	15
2140	Lw�wek	15
2141	Miedzichowo	15
2142	Nowy Tomy�l	15
2143	Opalenica	15
2144	Zb�szy�	15
2145	Bojanowo	15
2146	Jutrosin	15
2147	Miejska G�rka	15
2148	Pakos�aw	15
2149	Rawicz	15
2150	Przem�t	15
2151	Siedlec	15
2152	Wolsztyn	15
2153	Leszno	15
2154	Chodzie�	15
2155	Budzy�	15
2156	Margonin	15
2157	Szamocin	15
2158	Czarnk�w	15
2159	Drawsko	15
2160	Krzy� Wielkopolski	15
2161	Lubasz	15
2162	Po�ajewo	15
2163	Trzcianka	15
2164	Wiele�	15
2165	Pi�a	15
2166	Bia�o�liwie	15
2167	Kaczory	15
2168	�ob�enica	15
2169	Miasteczko Kraje�skie	15
2170	Szyd�owo	15
2171	Uj�cie	15
2172	Wyrzysk	15
2173	Wysoka	15
2174	W�growiec	15
2175	Damas�awek	15
2176	Go�a�cz	15
2177	Mie�cisko	15
2178	Skoki	15
2179	Wapno	15
2180	Z�ot�w	15
2181	Jastrowie	15
2182	Krajenka	15
2183	Lipka	15
2184	Okonek	15
2185	Tarn�wka	15
2186	Zakrzewo	15
2187	Oborniki	15
2188	Rogo�no	15
2189	Ryczyw�	15
2190	Lubo�	15
2191	Puszczykowo	15
2192	Buk	15
2193	Czerwonak	15
2194	Dopiewo	15
2195	Kleszczewo	15
2196	Komorniki	15
2197	Kostrzyn	15
2198	K�rnik	15
2199	Mosina	15
2200	Murowana Go�lina	15
2201	Pobiedziska	15
2202	Rokietnica	15
2203	St�szew	15
2204	Suchy Las	15
2205	Swarz�dz	15
2206	Tarnowo Podg�rne	15
2207	Obrzycko	15
2208	Duszniki-Zdr�j	15
2209	Ka�mierz	15
2210	Ostror�g	15
2211	Pniewy	15
2212	Szamotu�y	15
2213	Wronki	15
2214	Dominowo	15
2215	Krzykosy	15
2216	Nowe Miasto nad Wart�	15
2217	�roda Wielkopolska	15
2218	Zaniemy�l	15
2219	Brodnica	15
2220	Dolsk	15
2221	Ksi�� Wielkopolski	15
2222	�rem	15
2223	Pozna�	15
2224	Bia�ogard	16
2225	Karlino	16
2226	Tychowo	16
2227	Czaplinek	16
2228	Drawsko Pomorskie	16
2229	Kalisz Pomorski	16
2230	Ostrowice	16
2231	Wierzchowo	16
2232	Z�ocieniec	16
2233	Ko�obrzeg	16
2234	Dygowo	16
2235	Go�cino	16
2236	Ryma�	16
2237	Siemy�l	16
2238	Ustronie Morskie	16
2239	B�dzino	16
2240	Biesiekierz	16
2241	Bobolice	16
2242	Manowo	16
2243	Mielno	16
2244	Polan�w	16
2245	Sian�w	16
2246	�wieszyno	16
2247	Dar�owo	16
2248	S�awno	16
2249	Malechowo	16
2250	Postomino	16
2251	Szczecinek	16
2252	Barwice	16
2253	Bia�y B�r	16
2254	Borne Sulinowo	16
2255	Grzmi�ca	16
2256	�widwin	16
2257	Brze�no	16
2258	Po�czyn-Zdr�j	16
2259	R�bino	16
2260	S�awoborze	16
2261	Wa�cz	16
2262	Cz�opa	16
2263	Miros�awiec	16
2264	Tuczno	16
2265	Koszalin	16
2266	Bierzwnik	16
2267	Choszczno	16
2268	Drawno	16
2269	Krz�cin	16
2270	Pe�czyce	16
2271	Recz	16
2272	Brojce	16
2273	Gryfice	16
2274	Karnice	16
2275	P�oty	16
2276	Radowo Ma�e	16
2277	Resko	16
2278	Rewal	16
2279	Trzebiat�w	16
2280	Barlinek	16
2281	Boleszkowice	16
2282	D�bno	16
2283	My�lib�rz	16
2284	Nowogr�dek Pomorski	16
2285	Bielice	16
2286	Kozielice	16
2287	Lipiany	16
2288	Przelewice	16
2289	Pyrzyce	16
2290	Warnice	16
2291	Stargard Szczeci�ski	16
2292	Chociwel	16
2293	Dobrzany	16
2294	Dolice	16
2295	I�sko	16
2296	Kobylanka	16
2297	�obez	16
2298	Marianowo	16
2299	Stara D�browa	16
2300	Sucha�	16
2301	W�gorzyno	16
2302	Dobra	16
2303	Szczecin	16
2304	Goleni�w	16
2305	Maszewo	16
2306	Nowogard	16
2307	Osina	16
2308	Przybiern�w	16
2309	Stepnica	16
2310	Banie	16
2311	Cedynia	16
2312	Chojna	16
2313	Gryfino	16
2314	Mieszkowice	16
2315	Mory�	16
2316	Stare Czarnowo	16
2317	Trzci�sko-Zdr�j	16
2318	Widuchowa	16
2319	Dziwn�w	16
2320	Golczewo	16
2321	Kamie� Pomorski	16
2322	Mi�dzyzdroje	16
2323	�wierzno	16
2324	Wolin	16
2325	Ko�baskowo	16
2326	Nowe Warpno	16
2327	Police	16
2328	�winouj�cie	16
\.


--
-- TOC entry 3889 (class 0 OID 7818979)
-- Dependencies: 198
-- Data for Name: meeting; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.meeting (id_meeting, date, "time", subject_id_subject, user_id_user, meeting_place) FROM stdin;
\.


--
-- TOC entry 3890 (class 0 OID 7818992)
-- Dependencies: 199
-- Data for Name: notice; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.notice (id_notice, look_or_offer, note, meeting_place, meeting_date, price, subject_id_subject, active, "timestamp", user_id_user, meeting_id_meeting, time_from, time_to, level) FROM stdin;
\.


--
-- TOC entry 3891 (class 0 OID 7819001)
-- Dependencies: 200
-- Data for Name: opinion; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.opinion (id_opinion, rating, comment, user_to, user_from, user_id_user, user_id_user1) FROM stdin;
\.


--
-- TOC entry 3892 (class 0 OID 7819009)
-- Dependencies: 201
-- Data for Name: subject; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.subject (id_subject, name, subject_id_subject) FROM stdin;
1	administracja	\N
2	aerodynamika	\N
3	aktorstwo	\N
4	algebra	\N
5	analiza matematyczna	\N
6	anatomia	\N
7	architektura	\N
8	astronomia	\N
9	automatyka	\N
10	badania operacyjne	\N
11	bazy danych	\N
12	BHP	\N
13	bibliotekoznawstwo	\N
14	biochemia	\N
15	biologia	\N
16	biologia molekularna	\N
17	biznes	\N
18	boks	\N
19	bryd�	\N
20	budownictwo	\N
21	ceramika	\N
22	chemia	\N
23	doradztwo zawodowe	\N
24	druk 3D	\N
25	dziennikarstwo	\N
26	efektywna nauka	\N
27	ekonometria	\N
28	ekonomia	\N
29	ekonomia matematyczna	\N
30	elektroenergetyka	\N
31	elektronika	\N
32	elektrotechnika	\N
33	emisja g�osu	\N
34	energetyka	\N
35	energoelektronika	\N
36	ergonomia	\N
37	etyka	\N
38	etykieta biznesu	\N
39	farmacja	\N
40	filozofia	\N
41	finanse i rachunkowo��	\N
42	fitness	\N
43	fizjologia	\N
44	fizjoterapia	\N
45	fizyka	\N
46	florystyka	\N
47	fotografia	\N
48	fryzjerstwo	\N
49	genetyka	\N
50	geodezja	\N
51	geografia	\N
52	geologia	\N
53	geometria wykre�lna	\N
54	gospodarka przestrzenna	\N
55	gra na instrumentach	\N
56	grafika komputerowa	\N
57	historia	\N
58	historia sztuki	\N
59	hotelarstwo	\N
60	informatyka	\N
61	in�ynieria chemiczna	\N
62	jazda konna	\N
63	jazda na deskorolce	\N
64	jazda na �y�wach	\N
65	jazda na nartach	\N
66	jazda na rolkach	\N
67	j�zyk afrikaans	\N
68	j�zyk akadyjski	\N
69	j�zyk alba�ski	\N
70	j�zyk angielski	\N
71	j�zyk arabski	\N
72	j�zyk azerbejd�a�ski	\N
73	j�zyk bia�oruski	\N
74	j�zyk bu�garski	\N
75	j�zyk chi�ski	\N
76	j�zyk chorwacki	\N
77	j�zyk czeski	\N
78	j�zyk dari	\N
79	j�zyk du�ski	\N
80	j�zyk egipski	\N
81	j�zyk esperanto	\N
82	j�zyk esto�ski	\N
83	j�zyk fi�ski	\N
84	j�zyk francuski	\N
85	j�zyk grecki	\N
86	j�zyk gruzi�ski	\N
87	j�zyk hebrajski	\N
88	j�zyk hindi	\N
89	j�zyk hiszpa�ski	\N
90	j�zyk holenderski	\N
91	j�zyk indonezyjski	\N
92	j�zyk islandzki	\N
93	j�zyk japo�ski	\N
94	j�zyk jidysz	\N
95	j�zyk katalo�ski	\N
96	j�zyk korea�ski	\N
97	j�zyk litewski	\N
98	j�zyk �otewski	\N
99	j�zyk �u�ycki	\N
100	j�zyk macedo�ski	\N
101	j�zyk migowy	\N
102	j�zyk mongolski	\N
103	j�zyk niderlandzki	\N
104	j�zyk niemiecki	\N
105	j�zyk norweski	\N
106	j�zyk ormia�ski	\N
107	j�zyk paszto	\N
108	j�zyk perski	\N
109	j�zyk polski	\N
110	j�zyk polski dla cudzoziemc�w	\N
111	j�zyk portugalski	\N
112	j�zyk rosyjski	\N
113	j�zyk rumu�ski	\N
114	j�zyk serbski	\N
115	j�zyk s�owacki	\N
116	j�zyk s�owe�ski	\N
117	j�zyk sumeryjski	\N
118	j�zyk szwedzki	\N
119	j�zyk tajski	\N
120	j�zyk tamilski	\N
121	j�zyk turecki	\N
122	j�zyk tybeta�ski	\N
123	j�zyk ukrai�ski	\N
124	j�zyk uzbecki	\N
125	j�zyk w�gierski	\N
126	j�zyk wietnamski	\N
127	j�zyk w�oski	\N
128	j�zykoznawstwo	\N
129	joga	\N
130	kaligrafia	\N
131	karate	\N
132	konstrukcje in�ynierskie	\N
133	kosmetologia	\N
134	kulinaria	\N
135	kultura antyczna	\N
136	kulturoznawstwo	\N
137	�acina	\N
138	literaturoznawstwo	\N
139	logika	\N
140	logistyka	\N
141	logopedia	\N
142	malarstwo i rysunek	\N
143	marketing	\N
144	matematyka	\N
145	matematyka dyskretna	\N
146	matematyka wy�sza	\N
147	mechanika	\N
148	mechanika budowli	\N
149	mechanika lotu	\N
150	mechanika p�yn�w	\N
151	mechanika techniczna	\N
152	medycyna	\N
153	metodologia bada�	\N
154	metody numeryczne	\N
155	mikrobiologia	\N
156	mikroekonometria	\N
157	modelarstwo	\N
158	motywacja	\N
159	muzyka	\N
160	nauczanie pocz�tkowe	\N
161	nauka jazdy	\N
162	nauka o materia�ach	\N
163	nauka �piewu	\N
164	obs�uga komputera	\N
165	ochrona �rodowiska	\N
166	parlamentaryzm	\N
167	pedagogika	\N
168	p�ywanie	\N
169	podstawy konstrukcji maszyn	\N
170	politologia	\N
171	pozycjonowanie stron	\N
172	prawo	\N
173	produkcja filmu	\N
174	prognozowanie	\N
175	programowanie	\N
176	przedsi�biorczo���	\N
177	przyroda	\N
178	psychologia	\N
179	public relations	\N
180	rachunek prawdopodobie�stwa	\N
181	rachunkowo��	\N
182	robotyka	\N
183	rolnictwo	\N
184	rozw�j osobisty	\N
185	rysunek techniczny	\N
186	rze�ba	\N
187	samoobrona	\N
188	jazda na snowboardzie	\N
189	socjologia	\N
190	sporty walki	\N
191	stateczno�� jednostki p�ywaj�cej	\N
192	statystyka	\N
193	strzelectwo sportowe	\N
194	szachy	\N
195	sztuka cyrkowa	\N
196	szycie na maszynie	\N
197	szyde�kowanie	\N
198	taniec	\N
199	techniki pami�ciowe	\N
200	telekomunikacja	\N
201	tenis	\N
202	termodynamika	\N
203	transport	\N
204	turystyka	\N
205	tworzenie stron	\N
206	weterynaria	\N
207	wiedza o ta�cu	\N
208	wiedza powszechna	\N
209	witra�	\N
210	wos	\N
211	wyst�pienia publiczne	\N
212	wytrzyma�o�� materia��w	\N
213	zarz�dzanie	\N
214	�eglarstwo	\N
\.


--
-- TOC entry 3896 (class 0 OID 8737607)
-- Dependencies: 205
-- Data for Name: userr; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.userr (id_user, login, name, surname, birth_date, avatar, phone, email, timesstamp, password, city_id_city, about, id_city) FROM stdin;
2	loggggggin	Ger4alt	Z4rivi	1977-01-02	\\x	7778577777	qwer@drrrrrjhg.poiu	2016-06-23 02:10:28+00	qwerty	1	 Jan Router trzeci ��czy� ma�e sieci 	2
1	przykalfdadfaaffdfasddowy	Geralt	Zrivi	1997-04-02	\\x5c783332333033313339	77777777	qwer@djhg.poiu	2016-06-23 02:10:25+00	abcd	1	 Jan Router 3 ��czy� ma�e siecii	1
\.


--
-- TOC entry 3893 (class 0 OID 7819022)
-- Dependencies: 202
-- Data for Name: voivodeship; Type: TABLE DATA; Schema: public; Owner: zpdvzfaemzaact
--

COPY public.voivodeship (id_voivodeship, name_voivodeship) FROM stdin;
1	Podkarpackie
2	Kujawsko-Pomorskie
3	Lubelskie
4	Lubuskie\n
5	��dzkie
6	Ma�opolskie
7	Mazowieckie
8	Opolskie
9	Dolny �l�sk
10	Podlaskie
11	Pomorskie
12	�l�skie
13	�wi�tokrzyskie
14	Warmi�sko-mazurskie
15	Wielkopolskie
16	Zachodniopomorskim
\.


--
-- TOC entry 3907 (class 0 OID 0)
-- Dependencies: 203
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: zpdvzfaemzaact
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


--
-- TOC entry 3908 (class 0 OID 0)
-- Dependencies: 204
-- Name: notice_id_notice_seq; Type: SEQUENCE SET; Schema: public; Owner: zpdvzfaemzaact
--

SELECT pg_catalog.setval('public.notice_id_notice_seq', 9, true);


--
-- TOC entry 3737 (class 2606 OID 7818973)
-- Name: adminn admin_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.adminn
    ADD CONSTRAINT admin_pk PRIMARY KEY (id_admin);


--
-- TOC entry 3739 (class 2606 OID 7818978)
-- Name: city city_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.city
    ADD CONSTRAINT city_pk PRIMARY KEY (id_city);


--
-- TOC entry 3741 (class 2606 OID 7818984)
-- Name: meeting meeting_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.meeting
    ADD CONSTRAINT meeting_pk PRIMARY KEY (id_meeting);


--
-- TOC entry 3743 (class 2606 OID 7819000)
-- Name: notice notice_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.notice
    ADD CONSTRAINT notice_pk PRIMARY KEY (id_notice);


--
-- TOC entry 3745 (class 2606 OID 7819008)
-- Name: opinion opinion_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.opinion
    ADD CONSTRAINT opinion_pk PRIMARY KEY (id_opinion);


--
-- TOC entry 3747 (class 2606 OID 7819013)
-- Name: subject subject_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.subject
    ADD CONSTRAINT subject_pk PRIMARY KEY (id_subject);


--
-- TOC entry 3751 (class 2606 OID 8737614)
-- Name: userr user_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.userr
    ADD CONSTRAINT user_pk PRIMARY KEY (id_user);


--
-- TOC entry 3749 (class 2606 OID 7819026)
-- Name: voivodeship voivodeship_pk; Type: CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.voivodeship
    ADD CONSTRAINT voivodeship_pk PRIMARY KEY (id_voivodeship);


--
-- TOC entry 3752 (class 2606 OID 7819027)
-- Name: city city_voivodeship_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.city
    ADD CONSTRAINT city_voivodeship_fk FOREIGN KEY (voivodeship_id_voivodeship) REFERENCES public.voivodeship(id_voivodeship);


--
-- TOC entry 3762 (class 2606 OID 8738235)
-- Name: opinion fk76fk4830w0ed99skxxcdvptrq; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.opinion
    ADD CONSTRAINT fk76fk4830w0ed99skxxcdvptrq FOREIGN KEY (user_from) REFERENCES public.userr(id_user);


--
-- TOC entry 3758 (class 2606 OID 8737845)
-- Name: opinion fk8lq0b5rsnykji5uy577co4csk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.opinion
    ADD CONSTRAINT fk8lq0b5rsnykji5uy577co4csk FOREIGN KEY (user_id_user) REFERENCES public.userr(id_user);


--
-- TOC entry 3763 (class 2606 OID 8738240)
-- Name: opinion fkclbw9sl6064m8iygm3fembvt7; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.opinion
    ADD CONSTRAINT fkclbw9sl6064m8iygm3fembvt7 FOREIGN KEY (user_to) REFERENCES public.userr(id_user);


--
-- TOC entry 3759 (class 2606 OID 8737850)
-- Name: opinion fkds1adt2fqq7brq177bopt2i95; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.opinion
    ADD CONSTRAINT fkds1adt2fqq7brq177bopt2i95 FOREIGN KEY (user_id_user1) REFERENCES public.userr(id_user);


--
-- TOC entry 3753 (class 2606 OID 7819047)
-- Name: meeting meeting_subject_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.meeting
    ADD CONSTRAINT meeting_subject_fk FOREIGN KEY (subject_id_subject) REFERENCES public.subject(id_subject);


--
-- TOC entry 3754 (class 2606 OID 8738165)
-- Name: meeting meeting_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.meeting
    ADD CONSTRAINT meeting_user_fk FOREIGN KEY (user_id_user) REFERENCES public.userr(id_user);


--
-- TOC entry 3755 (class 2606 OID 7819057)
-- Name: notice notice_meeting_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.notice
    ADD CONSTRAINT notice_meeting_fk FOREIGN KEY (meeting_id_meeting) REFERENCES public.meeting(id_meeting);


--
-- TOC entry 3756 (class 2606 OID 7819062)
-- Name: notice notice_subject_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.notice
    ADD CONSTRAINT notice_subject_fk FOREIGN KEY (subject_id_subject) REFERENCES public.subject(id_subject);


--
-- TOC entry 3757 (class 2606 OID 8738170)
-- Name: notice notice_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.notice
    ADD CONSTRAINT notice_user_fk FOREIGN KEY (user_id_user) REFERENCES public.userr(id_user);


--
-- TOC entry 3760 (class 2606 OID 8738175)
-- Name: opinion opinion_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.opinion
    ADD CONSTRAINT opinion_user_fk FOREIGN KEY (user_id_user) REFERENCES public.userr(id_user);


--
-- TOC entry 3761 (class 2606 OID 8738180)
-- Name: opinion opinion_user_fkv2; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.opinion
    ADD CONSTRAINT opinion_user_fkv2 FOREIGN KEY (user_id_user1) REFERENCES public.userr(id_user);


--
-- TOC entry 3764 (class 2606 OID 7819082)
-- Name: subject subject_subject_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.subject
    ADD CONSTRAINT subject_subject_fk FOREIGN KEY (subject_id_subject) REFERENCES public.subject(id_subject);


--
-- TOC entry 3765 (class 2606 OID 8737615)
-- Name: userr user_city_fk; Type: FK CONSTRAINT; Schema: public; Owner: zpdvzfaemzaact
--

ALTER TABLE ONLY public.userr
    ADD CONSTRAINT user_city_fk FOREIGN KEY (city_id_city) REFERENCES public.city(id_city);


--
-- TOC entry 3902 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: zpdvzfaemzaact
--

REVOKE ALL ON SCHEMA public FROM postgres;
REVOKE ALL ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO zpdvzfaemzaact;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- TOC entry 3903 (class 0 OID 0)
-- Dependencies: 628
-- Name: LANGUAGE plpgsql; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON LANGUAGE plpgsql TO zpdvzfaemzaact;


-- Completed on 2019-06-02 00:45:59

--
-- PostgreSQL database dump complete
--

