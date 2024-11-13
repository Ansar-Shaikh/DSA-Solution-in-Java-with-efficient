function showDetails(skill) {
    let details = {
        'dsa': 'Expert in Data Structures & Algorithms (DSA). Proficient in solving complex problems using Java and optimizing solutions for efficiency.',
        'mern': 'Proficient in the MERN Stack (MongoDB, Express.js, React.js, Node.js). Capable of building full-stack web applications.',
        'leetcode': 'Active problem solver on LeetCode. Focused on improving problem-solving skills and competitive programming.',
        'sql': 'Experienced in SQL for database management and queries. Capable of handling complex data manipulation in relational databases.'
    };

    document.getElementById('skill-details').innerText = details[skill];
}
